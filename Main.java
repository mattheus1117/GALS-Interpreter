import gals.Lexico;
import gals.Semantico;
import gals.Sintatico;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {
        try {
            String filePath = "entrada.txt";  // caminho relativo ao Main.java
            Reader fileRender = new FileReader(filePath);

            Lexico lexico = new Lexico(fileRender);
            Sintatico sintatico = new Sintatico();
            Semantico semantico = new Semantico();

            sintatico.parse(lexico, semantico);
        } 
        catch (Exception e) {
            System.out.println("Erro encontrado: " + e.getMessage());
        }
    }
}
