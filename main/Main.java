package main;

import gals.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            String filePath = "./src/main/entrada.txt";

            Lexico lexico = new Lexico(filePath);

            Sintatico sintatico = new Sintatico();
            Semantico semantico = new Semantico();

            sintatico.parse(lexico, semantico);
        } catch (Exception error) { 
            System.out.println("Comando não identificado");
        }
    }
}
