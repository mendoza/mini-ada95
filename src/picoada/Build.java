package picoada;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java_cup.runtime.Symbol;

public class Build {

    public static void main(String[] args) throws Exception {
        String lexer_path = "/Users/jeancasoto/CompiladoresI/mini-ada95/src/picoada/ada.flex";
        String lexercup_path = "/Users/jeancasoto/CompiladoresI/mini-ada95/src/picoada/adaCup.flex";
        String[] rutaS = {"-parser", "Sintax", "/Users/jeancasoto/CompiladoresI/mini-ada95/src/picoada/Sintax.cup"};
        generateFiles(lexer_path, lexercup_path, rutaS);
    }

    public static void generateFiles(String lexer_path, String lexercup_path, String[] rutaS) throws IOException, Exception {
        System.out.println("---- GENERANDO PARTE LEXICA ----");
        File archivo;
        archivo = new File(lexer_path);
        JFlex.Main.generate(archivo);

        System.out.println("---- GENERANDO PARTE SINTACTICA ----");
        archivo = new File(lexercup_path);
        JFlex.Main.generate(archivo);

        System.out.println("---- ARCHIVO .CUP ----");
        java_cup.Main.main(rutaS);

        Path rutaSym = Paths.get("/Users/jeancasoto/CompiladoresI/mini-ada95/src/picoada/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("/Users/jeancasoto/CompiladoresI/mini-ada95/sym.java"),
                Paths.get("/Users/jeancasoto/CompiladoresI/mini-ada95/src/picoada/sym.java")
        );
        Path rutaSin = Paths.get("/Users/jeancasoto/CompiladoresI/mini-ada95/src/picoada/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("/Users/jeancasoto/CompiladoresI/mini-ada95/Sintax.java"),
                Paths.get("/Users/jeancasoto/CompiladoresI/mini-ada95/src/picoada/Sintax.java")
        );

    }
}
