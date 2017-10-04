package madgik.mySpark;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import com.google.common.reflect.ClassPath;

import madgik.mySpark.parser.ParserUtils;
import madgik.mySpark.parser.exception.VtExtensionParserException;

public class ExaremeSparkSession {

	private SparkSession spark;
	
	public ExaremeSparkSession(SparkSession spark) {
		
		this.spark =  spark;  
	}

	public Dataset<Row> sqlExtended(String query) throws VtExtensionParserException, IOException {
		
		if(ParserUtils.checkIfShowVt(query)){
			
			List<Row> vtables = new ArrayList<Row>();
			ClassPath cp=ClassPath.from(Thread.currentThread().getContextClassLoader());

			for(ClassPath.ClassInfo info : cp.getTopLevelClassesRecursive("madgik.mySpark.vtFunctions")) {
			    if(!info.getSimpleName().equals("ExaremeVtFunction")){
					vtables.add(RowFactory.create(info.getSimpleName()));
			    }
			}
			
			// The schema is encoded in a string
			String schemaString = "VIRTUAL_TABLES";
	
			// Generate the schema based on the string of schema
			List<StructField> fields = new ArrayList<StructField>();
			for (String fieldName : schemaString.split(" ")) {
			  StructField field = DataTypes.createStructField(fieldName, DataTypes.StringType, true);
			  fields.add(field);
			}
			StructType schema = DataTypes.createStructType(fields);
	
			// Apply the schema to the RDD
			return spark.createDataFrame(vtables, schema);
			
		}else if(ParserUtils.checkIfSelectQuery(query)){
			VtParser vtParse = new VtParser(query, spark);
			return vtParse.parseAndEvaluate();
			
		}else{
			
			return spark.sql(query);
		
		}
		
	}

	public SparkSession getSparkSession() {
		return spark;
	}
	
	public static exaremeBuilder exaremebuild() {
		return new exaremeBuilder();
	}
	
	public static class exaremeBuilder extends SparkSession.Builder {
		
		@Override
		public exaremeBuilder master(String master) {
			super.master(master);
			return this;
		}
		
		@Override
		public synchronized exaremeBuilder config(SparkConf conf) {
			super.config(conf);			
			return this;
		}
		
		@Override
		public synchronized exaremeBuilder config(String key, boolean value) {
			super.config(key, value);
			return this;
		}
		
		@Override
		public synchronized exaremeBuilder config(String key, double value) {
			super.config(key, value);
			return this;
		}
		
		@Override
		public synchronized exaremeBuilder config(String key, long value) {
			super.config(key, value);
			return this;
		}
		
		@Override
		public synchronized exaremeBuilder config(String key, String value) {
			super.config(key, value);
			return this;
		}
		
		@Override
		public synchronized exaremeBuilder enableHiveSupport() {
			super.enableHiveSupport();
			return this;
		}
		
		@Override
		public exaremeBuilder appName(String name) {
			super.appName(name);
			return this;
		}
		
		public synchronized ExaremeSparkSession getOrCreateExareme() {

			ExaremeSparkSession exare = new ExaremeSparkSession(super.getOrCreate());
			
			return exare;
		}
	}
	
}
