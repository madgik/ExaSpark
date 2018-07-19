package madgik.exaSpark.vtFunctions;

import org.apache.spark.sql.SparkSession;

public interface ExaremeVtFunction {
	
	public String mapReduce(SparkSession spark);

}
