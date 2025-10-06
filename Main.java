import gals.Lexico;
import gals.Semantico;
import gals.Sintatico;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            String filePath = "entrada.txt";
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
