package madgik.exaSpark.rest.api.entities;

import java.util.ArrayList;
import java.util.List;

public class QueryResponse {
	
	
	private List<String> rows = new ArrayList<String>();
	
	

	public List<String> getRows() {
		return rows;
	}

	public void setRows(List<String> rows) {
		this.rows = rows;
	}
	
	

}
