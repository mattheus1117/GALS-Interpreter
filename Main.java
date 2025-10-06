import gals.Lexico;
import gals.Semantico;
import gals.Sintatico;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // String filePath = "entrada.txt";

            Lexico lexico = new Lexico("A = 1010;B = 101;C = B - A;show(C);");
            Sintatico sintatico = new Sintatico();
            Semantico semantico = new Semantico();

            sintatico.parse(lexico, semantico);
        } 
        catch (Exception e) {
            System.out.println("Erro encontrado: " + e.getMessage());
            //e.printStackTrace(); // Mostra o erro detalhado
        }
    }
}
