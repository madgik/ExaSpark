package madgik.exaSpark.rest.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExaremeRuntimeException extends RuntimeException {

	private static final long serialVersionUID = -388267734593552340L;

	public ExaremeRuntimeException(String exception) {
	    super(exception);
	  }

	}
