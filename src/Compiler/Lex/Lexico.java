package Compiler.Lex;

import java.io.File;

/**
 * Clase del analizador lexico
 */
public class Lexico {
    private static final String cwd = System.getProperty("user.dir");

    public static void generarLexer(String ruta) {
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }

//    public static void main(String[] args) {
//        String path = "/src/Compiler/Lex/lexical.jflex";
//        String ruta  = cwd.replaceAll("\\\\", "/") + path;
//        generarLexer(ruta);
//    }
}
