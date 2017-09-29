package madgik.mySpark;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import com.google.common.reflect.ClassPath;

public class Candidates {
	
	private static List<String> candidates = new ArrayList<String>();

	public static String[] getCandidates(SparkSession spark) throws IOException {
		
		getReservedWords();
		getVirtualTables();
		getTables(spark);
		return candidates.toArray(new String[0]);
		
	}
	
	private static void getReservedWords() throws IOException {
		
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		
		candidates.addAll(IOUtils.readLines(classloader.getResourceAsStream("ReservedWords.txt")));
		
	}
	
	private static void getVirtualTables() throws IOException {
		
		ClassPath cp=ClassPath.from(Thread.currentThread().getContextClassLoader());

		for(ClassPath.ClassInfo info : cp.getTopLevelClassesRecursive("madgik.mySpark.vtFunctions")) {
		    if(!info.getSimpleName().equals("ExaremeVtFunction")){
		    	candidates.add(info.getSimpleName().toLowerCase());
		    }
		}
	}
	
	private static void getTables(SparkSession spark){
		
		List<Row> tables = spark.sql("show tables").toDF().collectAsList();
		
		for(Row row : tables){
			candidates.add(row.getString(0));
		}
		
	}
	
}
