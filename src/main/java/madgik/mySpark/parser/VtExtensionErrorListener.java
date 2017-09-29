package madgik.mySpark.parser;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import madgik.mySpark.console.Console;

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
		
		Console.printMessage(ParserUtils.displayError(ParserUtils.getErrorMessage(this.query, msg, line, charPositionInLine)));
		
	}

		
	
}
