package madgik.exaSpark.rest.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.util.CollectionAccumulator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.CSVWriter;

import madgik.exaSpark.ExaSparkSessionAuto;
import madgik.exaSpark.ExaremeSparkSession;
import madgik.exaSpark.rest.api.entities.QueryResponse;

@RestController
public class ExaremeController {
	
	 @PostMapping(value="query", produces="application/json")
	 public QueryResponse query(@RequestParam("query") String param) {
		 
		 QueryResponse qR = new QueryResponse();
		 ExaremeSparkSession e =   ExaSparkSessionAuto.initExaSpark();
		
		
		try {
			CollectionAccumulator<String> accum = e.getSparkSession().sparkContext().collectionAccumulator();

			Dataset<Row> queryResponse = e.sqlExtended(param);
			
			Dataset<String> qRJson = queryResponse.toJSON();
			
			qRJson.foreach(row -> {
				
				accum.add(row);
			
			});
			
			qR.setRows(accum.value());
			
		} catch (Exception e1 ){
			if(e1.getCause() != null){
				throw new ExaremeRuntimeException(e1.getCause().getMessage());
				
			}else{
				if(e1.getMessage() != null){
					throw new ExaremeRuntimeException(e1.getMessage());
				}else{
					throw new ExaremeRuntimeException("Malformed sql query");
				}
				
			}
		}
	    	
		return qR;
		
    }
	 
	 @PostMapping(value="query2", produces="text/csv")
	 @ResponseBody
	 public ResponseEntity<String> query2(@RequestParam("query") String param, HttpServletResponse response) throws IOException {
		
		 ExaremeSparkSession e =  ExaSparkSessionAuto.initExaSpark();
		 
		 try {
			 
			CSVWriter writer = new CSVWriter(response.getWriter(),CSVWriter.DEFAULT_SEPARATOR,
	                 CSVWriter.NO_QUOTE_CHARACTER,
	                 CSVWriter.DEFAULT_ESCAPE_CHARACTER,
	                 CSVWriter.DEFAULT_LINE_END);
			 
			CollectionAccumulator<String[]> accum = e.getSparkSession().sparkContext().collectionAccumulator();
			 
			Dataset<Row> queryResponse = e.sqlExtended(param);
			
			String[] cols = queryResponse.columns();
			
			queryResponse.foreach(row -> {
				
				List<String> rowData = new ArrayList<String>();
				for(int i = 0; i < row.length(); ++i) {
					rowData.add(row.getString(i));
				}
				accum.add(rowData.toArray(new String[rowData.size()]));
			
			});
			
			writer.writeNext(cols);
			writer.writeAll(accum.value());
			
		} catch (Exception e1 ){
			if(e1.getCause() != null){
				System.err.println(e1.getCause().getMessage());
				response.reset();
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e1.getCause().getMessage());
				
			}else{
				System.err.println(e1.getMessage());
				response.reset();
				if(e1.getMessage() != null){
					return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e1.getMessage());
				}else{
					return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Malformed sql query");
				}
				
			}
		}
		 
		 return ResponseEntity.ok(null);
	 
	 }

}
