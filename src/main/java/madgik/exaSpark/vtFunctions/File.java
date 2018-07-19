package madgik.exaSpark.vtFunctions;

import madgik.exaSpark.parser.exception.VtExtensionParserCancelationException;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class File implements ExaremeVtFunction{
    private static String DEFAULT_SPLIT = "\\|";
    private static String TEXT_EXTENSION = "txt";
    private static String JSON_EXTENSION = "json";
    private static String CSV_EXTENSION = "csv";
    private static String REGEX_PATTERN = "[.][^.]+$";


    private String Colums = null;
    private String filePath = null;

    public File(String Colums, String filePath) {
        super();
        this.Colums = Colums;
        this.filePath = filePath;
    }

    public File(String filePath) {
        super();
        this.filePath = filePath;
    }

    @Override
    public String mapReduce(SparkSession spark) {
        try {
            final Path p = Paths.get(this.filePath);
            final String TempvieName = p.getFileName().toString().replaceFirst(REGEX_PATTERN, "");
            final String fileExtension = getFileExtension(p.getFileName().toString());


            Dataset<Row> ResultDataset;
            if (fileExtension.equals(TEXT_EXTENSION) && this.Colums != null) {

                final List<String> fieldNames = Arrays.asList(Colums.split(DEFAULT_SPLIT));
                final List<StructField> fields = new ArrayList<>();

                fieldNames.stream().forEach(fieldName -> {
                    fields.add(DataTypes
                            .createStructField(fieldName.trim(), DataTypes.StringType, true));
                });

                ResultDataset = spark.read()
                        .schema(DataTypes.createStructType(fields))
                        .option("delimiter", ",")
                        .option("inferSchema", "true")
                        .csv(this.filePath);

            } else if (fileExtension.equals(JSON_EXTENSION))
                ResultDataset = spark.read().json(this.filePath);
            else if (fileExtension.equals(CSV_EXTENSION))
                ResultDataset = spark.read()
                        .option("header", "true")
                        .option("ignoreLeadingWhiteSpace", false)
                        .option("ignoreTrailingWhiteSpace", false).csv(this.filePath);
            else
                throw new IllegalArgumentException("The format File " + fileExtension + " may be wrong try again!!");


            ResultDataset.createOrReplaceTempView(TempvieName);
          //  ResultDataset.show(false);
            return TempvieName;
        } catch (Exception e) {
            throw new VtExtensionParserCancelationException(e.toString());
        }
    }

    private static String getFileExtension(String fileName) {
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        else return "";
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
