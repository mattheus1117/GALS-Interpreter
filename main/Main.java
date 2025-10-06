package main;

import gals.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Caminho do arquivo de entrada
            String filePath = "C:\\Users\\User\\Documents\\GitHub\\GALS-Interpreter\\src\\main\\entrada.txt";

            // Instancia o analisador léxico e passa o arquivo de entrada
            Lexico lexico = new Lexico(filePath);

            // Instancia o analisador sintático e o semântico
            Sintatico sintatico = new Sintatico();
            Semantico semantico = new Semantico();

            // Inicia o processo de análise
            sintatico.parse(lexico, semantico);

        } catch (Exception error) { 
            System.out.println("Comando não identificado");
        }
    }
}
