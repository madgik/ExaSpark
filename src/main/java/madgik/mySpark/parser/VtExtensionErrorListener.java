package madgik.mySpark.parser;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class VtExtensionErrorListener extends BaseErrorListener{

	private String query;
	
	public VtExtensionErrorListener(String query){
		super();
		this.query = query;
	}


	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
							Object offendingSymbol,
							int line,
							int charPositionInLine,
							String msg,
							RecognitionException e)
	{
		
<<<<<<< HEAD
		System.out.println(ParserUtils.displayError(ParserUtils.getErrorMessage(this.query, msg, line, charPositionInLine)));
=======
		System.out.println(ParserUtils.getErrorMessage(this.query, msg, line, charPositionInLine));
>>>>>>> 375dcf554fd703ef83c841f6ccbafad68c66f990
		
	}

		
	
}
