import java.io.*;

public class Main {

    static public void main (String argv[]) {
        try {

            // variable scanner de tipo Lexer
            Lexer scanner = new Lexer(new FileReader(argv[0]));
            scanner.yylex(); 

        }catch (Exception e) { }

    }

}