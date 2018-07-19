package madgik.exaSpark.udf;

import java.io.Serializable;

import org.apache.spark.sql.api.java.UDF1;
import org.apache.spark.sql.api.java.UDF2;

import madgik.exaSpark.ExaremeSparkSession;
import scala.collection.mutable.WrappedArray;

public class UdfManager implements Serializable{
	
	private static final long serialVersionUID = 6018310816254973067L;
	
	private static ExaremeSparkSession exa;
	
	public UdfManager(ExaremeSparkSession exa) {
		
		UdfManager.exa = exa;
		
	}

	//select jmerge(array('[tel1,pppo]','tel2','[1,2]')) as jmerge
	public UDF1<WrappedArray<String>, String> jmerge = new UDF1<WrappedArray<String>, String>() {

		
		private static final long serialVersionUID = -8932224818793966634L;

		@Override
		public String call(WrappedArray<String> arg0) throws Exception {
			
			Jmerge jmerge = new Jmerge(UdfManager.exa);
			return jmerge.doProcess(arg0);
			
		}
	};
	
	//select jmergeregexp('[\"abc\", \"def\", \"def\", \"defsdfdsfsdfdsfdsdsfsdsd\"]') as jmergeregexp
	public UDF1<String, String> jmergeregexp = new UDF1<String, String>() {

		
		private static final long serialVersionUID = -8932224818793966634L;

		@Override
		public String call(String arg0) throws Exception {
			
			Jmergeregexp jmergeregexp = new Jmergeregexp(UdfManager.exa);
			return jmergeregexp.doProcess(arg0);
			
		}
	};
	
	public UDF2<Double, Double, Double> cosineDistance = new UDF2<Double, Double, Double>() {

		
		private static final long serialVersionUID = -8932224818793966634L;

		@Override
		public Double call(Double t1, Double t2) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
	};


}
