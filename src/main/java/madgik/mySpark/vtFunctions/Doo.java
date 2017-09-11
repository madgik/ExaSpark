package madgik.mySpark.vtFunctions;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class Doo {
	private String delimeter;
	private Dataset<Row> dataset;
	private Dataset<Row> dataset2;
	
	public Doo(String delimeter, Dataset<Row> dataset, Dataset<Row> dataset2) {
		super();
		this.delimeter = delimeter;
		this.dataset = dataset;
		this.dataset2 = dataset2;
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

	
	public Dataset<Row> getDataset2() {
		return dataset2;
	}

	public void setDataset2(Dataset<Row> dataset2) {
		this.dataset2 = dataset2;
	}

	public String mapReduce(SparkSession spark) {
		
		
		dataset.limit(2).createOrReplaceTempView("people2");
		
		return "people2";
		
	}
}
