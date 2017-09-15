package madgik.mySpark.parser;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.catalyst.parser.SqlBaseBaseListener;
import org.apache.spark.sql.catalyst.parser.SqlBaseParser;
import org.spark_project.jetty.util.ConcurrentHashSet;

public class VtExtensionListener extends SqlBaseBaseListener{
	
	private SparkSession spark;
	private final VtExtensionErrorHandler handler;
	private Map<String,String> vtToViews = new ConcurrentHashMap<String,String>();
	private Set<String> vts = new ConcurrentHashSet<String>();
	
	
	public VtExtensionListener(SparkSession spark, VtExtensionErrorHandler handler) {
		super();
		this.spark = spark;
		this.handler = handler;
	}
	
	public Map<String, String> getVtToViews() {
		return vtToViews;
	}
	
	@Override 
	public void exitTableValuedFunction(SqlBaseParser.TableValuedFunctionContext ctx) { 
		
//		System.out.println("------------  CTX  ---------------------");
//		System.out.println(ctx.getText());
//		System.out.println(ctx.getChildCount());
//		System.out.println(ctx.getRuleContext().getText());
//		System.out.println(vts);
//		System.out.println("----------------------------------------");
		
		if(!vts.contains(ctx.getText())){
			vts.add(ctx.getText());
			
			estimateArgs(ctx);
			
		}
		
	}
	
	private void estimateArgs(SqlBaseParser.TableValuedFunctionContext ctx) {
		
		List<Object> tvfArgs = new ArrayList<Object>();
		List<Integer> tvfArgsTypes = new ArrayList<Integer>();
		
		
		String tvfName = ctx.getChild(0).getText();
		String sqlExpression;
		String sqlExpressionPrevious ;
		
		for(int expr=0 ; expr<ctx.expression().size(); ++expr) {
			sqlExpression = "";
//			System.out.println("~~~FOR:: "+expr+"  "+ctx.expression().get(expr).getText());
			if(ctx.expression().get(expr).getText().contains("SELECT")) {
				
				
				sqlExpression = ParserUtils.retrimWhitespaces(ctx.expression().get(expr).getText());
				Set<Entry<String, String>> mapSet = vtToViews.entrySet();
				for (Map.Entry<String, String> entry : mapSet)
				{
				   sqlExpressionPrevious = sqlExpression;
				   sqlExpression = sqlExpression.replace(entry.getKey(), entry.getValue());
				   
				   if(!sqlExpressionPrevious.equals(sqlExpression)){
//					   System.out.println("&&&HASHMAP PRIN:: " +vtToViews);
					   vtToViews.remove(entry.getKey(), entry.getValue());
//					   System.out.println("&&&HASHMAP META:: " +vtToViews);
				   }
				   
				}
				
//				sqlExpression = ParserUtils.retrimWhitespaces(sqlExpression);
//				System.out.println("###SQL:: "+sqlExpression);
				
				tvfArgs.add(spark.sql(sqlExpression).toDF());
				tvfArgsTypes.add(1);
			}else{
				tvfArgs.add(ctx.expression().get(expr).getText().replaceAll("'", ""));
				tvfArgsTypes.add(0);
			}
			
		}
		
//		System.out.println(tvfName);
//		System.out.println(tvfArgs);
//		System.out.println(ctx.getText());
		
		String tvfNameCaps= tvfName.substring(0,1).toUpperCase() + tvfName.substring(1).toLowerCase();
		String clName = "madgik.mySpark.vtFunctions."+ tvfNameCaps;
		boolean correctArgs = false;
		
		try {
			
			ClassLoader classLoader = VtExtensionListener.class.getClassLoader();
			Class<?> cls = classLoader.loadClass(clName);
			//----------------------------------------------------
			Class<?> sparkParam[] = {SparkSession.class};
			
			Class<?>[] paramString = new Class[tvfArgs.size()];
			
			for(int i=0; i<tvfArgs.size(); ++i){
				if(tvfArgsTypes.get(i) == 0){
					paramString[i] = String.class;
				}else{
					paramString[i] = Dataset.class;
				}
			}
			
			Object iClass = cls.getConstructor(paramString).newInstance(tvfArgs.toArray());
			correctArgs = true;
			Method thisMethod = cls.getDeclaredMethod("mapReduce", sparkParam);

			vtToViews.put(ParserUtils.retrimWhitespaces(ctx.getText()), thisMethod.invoke(iClass, spark).toString());
			
//			System.out.println("@@@@HASHMAP:: " +vtToViews);
			
		} catch (ClassNotFoundException e) {
			String errorMessage = "Could not resolve \""+tvfNameCaps + "\" to a virtual table"; 
			handler.trigger(errorMessage ,e);
		} catch (NoSuchMethodException e) {
			String errorMessage;
			
			if(correctArgs == false){
				errorMessage = "Could not resolve arguments of "+tvfNameCaps+" virtual table";
			}else{
				errorMessage = "Could not find \"mapReduce\" method in "+tvfNameCaps+".class";
			}
			
			handler.trigger(errorMessage ,e);
		}  catch (IllegalAccessException e) {
			String errorMessage = "Illegal access exception to \""+tvfNameCaps + "\"  virtual table"; 
			handler.trigger(errorMessage ,e);
		} catch (IllegalArgumentException e) {
			String errorMessage = "Could not resolve arguments of "+tvfNameCaps+" virtual table";
			handler.trigger(errorMessage ,e);
		} catch (InstantiationException e) {
			String errorMessage = "Could not instatiate \""+tvfNameCaps + "\" virtual table"; 
			handler.trigger(errorMessage ,e);
		} catch (InvocationTargetException e) {
			String errorMessage = "Could not invocate \""+tvfNameCaps + "\" virtual table"; 
			handler.trigger(errorMessage ,e);
		}
		
	}

}
