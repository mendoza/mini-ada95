import java.io.*;

public class Main {

  public static void main(String argv[]) {
    try {
      // variable scanner de tipo Lexer
      Lexer scanner = new Lexer(new FileReader(argv[0]));
      // scanner.yylex();

      Parser p = new Parser(scanner);
      Object result = p.parse();
      System.out.println("==>" + result);
    } catch (Exception e) {}
  }
}
