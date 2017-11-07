package madgik.mySpark.vtFunctions;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.broadcast.Broadcast;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import madgik.mySpark.parser.exception.VtExtensionParserCancelationException;
import scala.Tuple2;

public class Equallengthhammingdistanceone implements ExaremeVtFunction{

	private String filePath;
	private int k;
	private int b;
	
	public Equallengthhammingdistanceone(String filePath, String b, String k) {
		super();
		this.filePath = filePath;
		this.b = Integer.parseInt(b);
		this.k = Integer.parseInt(k);
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
			
			JavaSparkContext ctx = new JavaSparkContext(spark.sparkContext());
			Broadcast<Integer> broadcastΚ = ctx.broadcast(k);
			Broadcast<Integer> broadcastB = ctx.broadcast(b);
			
			JavaRDD<String> wordsRDD = spark.read().textFile(filePath).javaRDD();
			
			// The schema is encoded in a string
			String schemaString = "wordA wordB";
	
			// Generate the schema based on the string of schema
			List<StructField> fields = new ArrayList<StructField>();
			for (String fieldName : schemaString.split(" ")) {
			  StructField field = DataTypes.createStructField(fieldName, DataTypes.StringType, true);
			  fields.add(field);
			}
			StructType schema = DataTypes.createStructType(fields);
			
			JavaPairRDD<String, String> aa = wordsRDD.flatMapToPair( s -> {
				
				List<Tuple2<String, String>> results = new ArrayList<>();
				
				if(s.length() == broadcastB.getValue()) {
				
					for(int i = 0 ; i < broadcastB.getValue(); i+=broadcastΚ.getValue()) {
					
						String sEnd = s.substring(0, i) + s.substring(i+broadcastΚ.getValue(), broadcastB.getValue());
						
						results.add(new Tuple2<>(sEnd, s));
					}
				}
				
				return results.iterator();
				
			});
			
			JavaPairRDD<String, Iterable<Tuple2<String, String>>> bb = aa.join(aa)
			  .filter( x -> !(x._2._1.equals(x._2._2)))
			  .filter(x -> x._2._1.compareTo(x._2._2) < 0)
			  .filter( x -> HD(x._2._1 , x._2._2) == 1)
			  .groupByKey();
			  
			JavaRDD<Tuple2<String, String>> cc = bb.flatMap( x -> {
				
				List<Tuple2<String, String>> results = new ArrayList<>();
				
				x._2.forEach( y -> {
					
					results.add(new Tuple2<>(y._1, y._2));
					
				});
				
				return results.iterator();
				
				
			});
			
			JavaRDD<Row> rowRDD2 = cc.map((Function<Tuple2<String, String>, Row>) record -> {
				
				  return RowFactory.create(record._1, record._2);
			});
			
			// Apply the schema to the RDD
			Dataset<Row> peopleDataFrame = spark.createDataFrame(rowRDD2, schema).distinct();
	
			// Creates a temporary view using the DataFrame
			peopleDataFrame.createOrReplaceTempView("hamming");
			
			return "hamming";
		}catch(Exception e){
			throw new VtExtensionParserCancelationException(e.getMessage());
		}
		
	}

	private static Integer HD(String left, String right) {
		
        if (left == null || right == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }

        if (left.length() != right.length()) {
            throw new IllegalArgumentException("Strings must have the same length");
        }

        int distance = 0;

        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                distance++;
            }
            if(distance > 1)
            	break;
        }

        return distance;
    }
	
	
}
