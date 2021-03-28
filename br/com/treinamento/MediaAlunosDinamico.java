package br.com.treinamento;

import java.util.Locale;
import java.util.Scanner;

public class MediaAlunosDinamico {

    public static void main(String[] args) {
        float notaAluno = 0;
        float totalNota = 0;
        float mediaNota = 0;
        int totalAluno = 0;

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.print("Insira uma nota ou -1 para terminar: ");
        notaAluno = scan.nextFloat();

        while(notaAluno < 0){
            System.out.print("Insira uma nota ou -1 para terminar: ");
            totalNota += notaAluno;
            totalAluno++;            
            notaAluno = scan.nextFloat();
        }

        mediaNota = totalNota / totalAluno;
        scan.close();
        System.out.println("A nota media da sala, para " + totalAluno + " alunos, foi de " + mediaNota);
    }
    
}
