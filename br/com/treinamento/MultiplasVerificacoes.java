package br.com.treinamento;

public class MultiplasVerificacoes {
    public static void main(String[] args) {
        int numero = 10;
        switch(numero){
            case 5:
                System.out.println("Valor é 5");
                break;
            case 10:
                System.out.println("Valor é 10");
                break;
            case 20:
                System.out.println("Valor é 20");
                break;
            default:
                System.out.println("Valor é " + numero);

        }
    }
}
