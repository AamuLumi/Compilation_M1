import java.io.FileReader;
//import java_cup.runtime.Symbol;
//import java_cup.runtime.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileReader  myFile = new FileReader(args[0]);
			PatateCompilateurLexer myLex = new PatateCompilateurLexer(myFile);
			PatateCompilateurParser myParser = new PatateCompilateurParser(myLex);
			try {
				myParser.parse();
			}
			catch (Exception e) {
				System.out.println("parse error");
			}
		}
		catch (Exception e){
			System.out.println("invalid file");
		}
	}
}
