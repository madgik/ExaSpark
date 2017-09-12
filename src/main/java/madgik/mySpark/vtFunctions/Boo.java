package madgik.mySpark.vtFunctions;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.MapFunction;

public class Boo{

	private String delimeter;
	private Dataset<Row> dataset;
	
	public Boo(String delimeter, Dataset<Row> dataset) {
		super();
		this.delimeter = delimeter;
		this.dataset = dataset;
	}

	public String getDelimeter() {
		return delimeter;
	}

	public void setDelimeter(String delimeter) {
		this.delimeter = delimeter;
	}

	
	public Dataset<Row> getDataset() {
		return dataset;
	}

	public void setDataset(Dataset<Row> dataset) {
		this.dataset = dataset;
	}

	public String mapReduce(SparkSession spark) {
		
		
		dataset.limit(2).createOrReplaceTempView("people2");
		
		return "people2";
		
	}
	
	
	
	
}

