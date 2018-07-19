package madgik.exaSpark.udf;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.json.JSONException;
import org.json.JSONObject;

import madgik.exaSpark.ExaremeSparkSession;

public class Jmergeregexp {
	
	private static final String PATTERN = "[^\\w\\s+]";
	private static final String START_REGEX = "(?:";
	private static final String END_REGEX = ")|";
	private static final String TempviewName = "Jmergeregexp";
	private static ExaremeSparkSession exa;
	
	public Jmergeregexp(ExaremeSparkSession exa) {
		Jmergeregexp.exa = exa;
	}
	
	public String doProcess(String arg0) throws JSONException{
		
		JavaSparkContext jsc = new JavaSparkContext(exa.getSparkSession().sparkContext());
	    List<String> jsonData = jsc.parallelize(Arrays.asList(arg0)).collect();
	
	    Dataset<String> StringDataset = exa.getSparkSession().createDataset(jsonData, Encoders.STRING());
	    Dataset<Row> dataset = exa.getSparkSession().read()
	            .json(StringDataset).toDF(TempviewName);
	
	
	    Dataset<String> resultDataset = dataset.map(
	        (MapFunction<Row, String>) row -> {
	            String s = "";
	            String rowstr = row.getString(0).trim().replaceAll(PATTERN, "");
	            for (String str : rowstr.split(" ")) {
	                s = s.trim() + START_REGEX + str + END_REGEX;
	            }
	            return s.substring(0, s.length() - 1);
	        },
	        Encoders.STRING()).toJSON();
	    JSONObject obj = new JSONObject(resultDataset.collectAsList().get(0));
	    String results = obj.getString("value").toString();
	
	    return results;

	        
		
	}

}
