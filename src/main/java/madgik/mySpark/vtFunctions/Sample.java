package madgik.mySpark.vtFunctions;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class Sample implements ExaremeVtFunction{

	private Integer numOfRecords;
	private Dataset<Row> dataset;
	
	public Sample(String numOfRecords, Dataset<Row> dataset) {
		super();
		this.dataset = dataset;
		this.numOfRecords = Integer.parseInt(numOfRecords);
	}

	public Dataset<Row> getDataset() {
		return dataset;
	}

	public Integer getNumOfRecords() {
		return numOfRecords;
	}

	public void setNumOfRecords(Integer numOfRecords) {
		this.numOfRecords = numOfRecords;
	}

	public void setDataset(Dataset<Row> dataset) {
		this.dataset = dataset;
	}

	@Override
	public String mapReduce(SparkSession spark) {
		long count = dataset.count();
		dataset.sample(false, 5.0*this.numOfRecords/count).limit(numOfRecords).createOrReplaceTempView("sample");

		return "sample";
		
	}
	
	
}
