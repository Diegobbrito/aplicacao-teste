package br.com.treinamento;

import java.util.Locale;
import java.util.Scanner;

public class MediaAlunos {

    public static void main(String[] args) {
        float notaAluno = 0;
        float totalNota = 0;
        float mediaNota = 0;
        int totalAluno = 0;

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        for(int i = 0; i < 5; i++){
            System.out.print("Insira uma nota para continuar: ");
            notaAluno = scan.nextFloat();
            totalNota += notaAluno;
            totalAluno++;
        }

        mediaNota = totalNota / totalAluno;
        scan.close();
        System.out.println("A nota media da sala, para " + totalAluno + " alunos, foi de " + mediaNota);
    }
    
}
