package madgik.mySpark;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.catalyst.analysis.ResolveTableValuedFunctions;
import org.apache.spark.sql.catalyst.parser.ParseException;
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan;
import org.apache.spark.sql.catalyst.plans.logical.Range;
import org.apache.spark.sql.types.DataType;
import org.apache.spark.sql.types.LongType;
import org.apache.spark.sql.types.StructType;

import scala.Int;
import scala.Option;


public class Example {

	private static final Option<Object> numSlices = null;

	public static void main(String[] args) throws ParseException {
		
		SparkSession spark = SparkSession.builder()
			     .master("local[4]")
			     .appName("MySpark")
			     .getOrCreate();
		
//		spark.sql("select count(*) from range(3)").show();
		
//		LogicalPlan lgk = spark.sessionState().sqlParser().parsePlan("select * from range(2)");
		
//		LogicalPlan lll = spark.sessionState().analyzer().execute(lgk);
//		
//		System.out.println(lll);
		
//		System.out.println(ResolveTableValuedFunctions.apply(lgk));
		
//		ResolveTableValuedFunctions.apply2(lgk);
		
		
//		DataType d = new LongType();
//		
//		StructType ss = new StructType();
//		ss.add("id", d);
//		
//		Option<Object> o;
		
//		ResolveTableValuedFunctions.apply2(lgk);
//		
//		QueryExecution q = new QueryExecution(spark, lgk);
//		System.out.println(q.analyzed());
//		System.out.println(q.analyzed().schema());
		
//		System.out.println(q);
		
//		QueryExecution queryExec = spark.sessionState().executePlan(lgk);
//		queryExec.assertAnalyzed();
		
//		System.out.println(spark.sessionState().analyzer().execute(lgk));
//		spark.sessionState().analyzer().checkAnalysis(lgk);
		
		String clName = "madgik.mySpark.ManaSou";
		
		try {
			Class params[] = {};
			Class[] paramString = new Class[3];
			paramString[0] = String.class;
			paramString[1] = String.class;
			paramString[2] = String.class;
			Object paramsObj[] = {};
			Class<?> cls = Class.forName(clName);
			
			Object[] intArgs = new Object[] { "1111", "2222", "3333" };
			
			List<String> smpoutsa = new ArrayList<String>();
			smpoutsa.add("1112223333");
			smpoutsa.add("2");
			smpoutsa.add("3");
			
			Constructor<?>[] constr = cls.getConstructors();
			Object iClass = null;
			
			for(Constructor<?> c : constr) {
				if(c.getParameterCount() == smpoutsa.size()) {
					iClass= c.newInstance(smpoutsa.toArray());
					break;
				}
			}
			
			
			
			
//			Object iClass = cls.getConstructors()[0].newInstance(intArgs);
			
//			System.out.println("BLABLABLA: "+cls.getConstructors()[0]);
			Method thisMethod = cls.getDeclaredMethod("getTsa", params);
			Method thisMethod2 = cls.getDeclaredMethod("setTaPantaOla", paramString);

			System.out.println(thisMethod2.invoke(iClass, smpoutsa.toArray()));
			System.out.println(thisMethod.invoke(iClass, paramsObj));
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
