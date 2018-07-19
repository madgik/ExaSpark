package madgik.exaSpark.udf;

import static org.apache.spark.sql.functions.col;
import static org.apache.spark.sql.functions.collect_list;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.json.JSONException;
import org.json.JSONObject;

import madgik.exaSpark.ExaremeSparkSession;
import scala.collection.JavaConversions;
import scala.collection.mutable.WrappedArray;

public class Jmerge {
	
	private static final String PATTERN = "[\\[\\]]";
	private static final String TempviewName = "Jmerge";
	private static ExaremeSparkSession exa;
	
	public Jmerge(ExaremeSparkSession exa) {
		Jmerge.exa = exa;
	}
	
	
	public String doProcess(WrappedArray<String> arg0) throws JSONException{
		List<String> jsonData = JavaConversions.seqAsJavaList(arg0);
		
		Dataset<String> StringDataset = exa.getSparkSession().createDataset(jsonData, Encoders.STRING());
        Dataset<Row> dataset = exa.getSparkSession().read()
	                .json(StringDataset).toDF(TempviewName);


        //dataset.show(false);
        Dataset<String> resultDataset = dataset.as(Encoders.STRING())
	                .flatMap((FlatMapFunction<String, String>) x -> Arrays.asList(x.trim().replaceAll(PATTERN,"").split(",")).iterator(),
	                        Encoders.STRING()).toDF(TempviewName).agg((collect_list(col(TempviewName)))).toJSON();
		
        JSONObject obj = new JSONObject(resultDataset.collectAsList().get(0));
        String results = obj.getJSONArray("collect_list(Jmerge)").toString();
        
        
		return results;
	}
	

}
