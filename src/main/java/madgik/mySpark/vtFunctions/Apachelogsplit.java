package madgik.mySpark.vtFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import madgik.mySpark.parser.exception.VtExtensionParserCancelationException;

public class Apachelogsplit implements ExaremeVtFunction{
	
	private String filePath;
	
	public Apachelogsplit(String filePath) {
		super();
		this.filePath = filePath;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	@Override
	public String mapReduce(SparkSession spark) throws VtExtensionParserCancelationException{
		try{
			// Create an RDD
			JavaRDD<String> peopleRDD = spark.sparkContext()
			  .textFile(filePath, 1)
			  .toJavaRDD();
			// The schema is encoded in a string
			String schemaString = "ip ident authuser date method uri httpver status bytes";
			String logEntryPattern = "^([a-zA-Z0-9_.-]*) (\\S+) (\\S+) \\[([\\w:/]+\\s[+\\-]\\d{4})\\] \"(.+?)\" (\\d{3}) (\\d*)";
			
			//select * from apachelogsplit('/home/ethimis/Downloads/access_log')
			// Generate the schema based on the string of schema
			List<StructField> fields = new ArrayList<StructField>();
			for (String fieldName : schemaString.split(" ")) {
			  StructField field = DataTypes.createStructField(fieldName, DataTypes.StringType, true);
			  fields.add(field);
			}
			StructType schema = DataTypes.createStructType(fields);
	
			// Convert records of the RDD (people) to Rows
			JavaRDD<Row> rowRDD = peopleRDD.map((Function<String, Row>) record -> {
					//----------------------------------------------------
				Pattern p = Pattern.compile(logEntryPattern);
				Matcher matcher = p.matcher(record);
			    if (!matcher.matches()) {
				      System.err.println("Bad log entry (or problem with RE?):");
				      System.err.println(record);
				      throw new VtExtensionParserCancelationException("Pattern or logs data are not correct");
			    }else{
//			    	System.out.println("IP Address: " + ((matcher.group(1) == null) ? "-" : matcher.group(1)));
//				    System.out.println("Date&Time: " + ((matcher.group(4) == null) ? "-" : matcher.group(4).split(" ")));
//				    System.out.println("Request: " + ((matcher.group(5) == null) ? "-" : matcher.group(5)));
//				    System.out.println("Response: " + ((matcher.group(6) == null) ? "-" : matcher.group(6)));
//				    System.out.println("Bytes Sent: " + ((matcher.group(7) == null) ? "-" : matcher.group(7)));;
					//----------------------------------------------------
				    String[] attributes = new String[10];
				    attributes[0] = ((matcher.group(1) == null) ? "-" : matcher.group(1));
				    attributes[1] = ((matcher.group(2) == null) ? "-" : matcher.group(2));
				    attributes[2] = ((matcher.group(3) == null) ? "-" : matcher.group(3));
				    attributes[3] = ((matcher.group(4) == null) ? "-" : matcher.group(4));
				    if(matcher.group(5) != null){
				    	String[] request = matcher.group(5).split(" ");
					  
				    	attributes[4] = ((request[0] == null) ? "-" : request[0]);
				    	attributes[5] = ((request[1] == null) ? "-" : request[1]);
				    	attributes[6] = ((request[2] == null) ? "-" : request[2]);
					  
				    }
				    attributes[7] = ((matcher.group(6) == null) ? "-" : matcher.group(6));
				    attributes[8] = ((matcher.group(7) == null) ? "-" : matcher.group(7));
//				  	attributes[8] = ((matcher.group(7) == null) ? "-" : matcher.group(7));
				    
				    return RowFactory.create(attributes);
			    }
			});
	
			
			// Apply the schema to the RDD
			Dataset<Row> peopleDataFrame = spark.createDataFrame(rowRDD, schema);
	
			// Creates a temporary view using the DataFrame
			peopleDataFrame.createOrReplaceTempView("apachelogs");
			
			return "apachelogs";
		}catch(Exception e){
			throw new VtExtensionParserCancelationException(e.getMessage());
		}
		
	}

}
