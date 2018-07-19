package madgik.exaSpark.vtFunctions;

import madgik.exaSpark.parser.exception.VtExtensionParserCancelationException;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.expressions.Window;
import org.apache.spark.sql.expressions.WindowSpec;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import static org.apache.spark.sql.functions.*;


public class Textwindow implements ExaremeVtFunction, Serializable {
    private static final String UDF_NAME1 = "RemoveWhiteSpaces";
    private static final String TEMPVIEW_NAME = "Textwindow";
    private static final String PREV = "Prev";
    private static final String MIDDLE = "MIDDLE";
    private static final String NEXT = "Next";
    private String splitBy = "";

    private static String REGEX_PATTERN = "\\s+";

    private String Phrase;
    private Dataset<Row> dataset = null;
    private final int PrevNum;
    private final int NextNum;
    private final String PatternNum;
    private String InputColumn;

    public Textwindow(String Phrase, String prevNum, String nextNum, String patternNum) {
        this.Phrase = Phrase;
        this.PrevNum = Integer.parseInt(prevNum);
        this.NextNum = Integer.parseInt(nextNum);
        this.PatternNum = patternNum;
    }

    public Textwindow(String InputColumn, String prevNum, String nextNum, String patternNum, Dataset<Row> dataset) {
        this.InputColumn = InputColumn;
        this.PrevNum = Integer.parseInt(prevNum);
        this.NextNum = Integer.parseInt(nextNum);
        this.PatternNum = patternNum;
        this.dataset = dataset;
    }

    @Override
    public String mapReduce(SparkSession spark) {

        try {

            if (this.dataset == null) {
                final JavaSparkContext jsc = new JavaSparkContext(spark.sparkContext());
                final List<String> jsonData = jsc.parallelize(Arrays.asList(Phrase)).collect();
                final Dataset<String> StringDataset = spark.createDataset(jsonData, Encoders.STRING());

                this.dataset = spark.read().json(StringDataset).toDF(TEMPVIEW_NAME);
                this.dataset = dataset.as(Encoders.STRING()).flatMap(
                        (FlatMapFunction<String, String>) x -> Arrays.asList(x.split(splitBy)).iterator(),
                        Encoders.STRING()).toDF("Words");
                this.splitBy = " ";
            } else {
                this.dataset = dataset.select(col(InputColumn)).flatMap(
                        (FlatMapFunction<Row, String>) x -> {
                            String rowStr = x.mkString().replaceAll(REGEX_PATTERN,"");
                            return Arrays.asList(rowStr.substring(13, rowStr.length() - 1).replaceAll("\\s+", "").split(",")
                            ).iterator();
                        },
                        Encoders.STRING()).toDF("Words");
                this.splitBy = ",";
            }
            Dataset<Row> Preprocess = dataset
                    .withColumn("ID", lit(monotonically_increasing_id()))
                    .select("ID", "Words")
                    .select(col("ID"), col("Words").as(MIDDLE));

            // .filter(col("Length").$eq$eq$eq(4))
          //  Preprocess.show(false);
            WindowSpec prevWindow = Window.partitionBy().orderBy(col("ID")).rangeBetween(-1 * PrevNum, -1);
            WindowSpec nextWindow = Window.partitionBy().orderBy(col("ID")).rangeBetween(1, NextNum);
            Dataset<Row> ResultDataset = Preprocess
                    .withColumn(PREV, collect_list(col(MIDDLE)).over(prevWindow).as(Encoders.STRING()))
                    .withColumn(NEXT, collect_list(col(MIDDLE)).over(nextWindow).as(Encoders.STRING()))
                    .filter(Preprocess.col(MIDDLE).rlike("\\" + PatternNum))
                    .select(col(PREV), regexp_replace(col(MIDDLE), REGEX_PATTERN, "").as(MIDDLE), col(NEXT));


            // ResultDataset.show(false);
            ResultDataset.createOrReplaceTempView(TEMPVIEW_NAME);
        } catch (Exception e) {
            e.printStackTrace();
            throw new VtExtensionParserCancelationException(e.toString());
        }
        return TEMPVIEW_NAME;
    }

}
