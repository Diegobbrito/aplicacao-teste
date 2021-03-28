package br.com.treinamento;

public class ComparaTipos {

    public static void main(String[] args) {
        
        String nome = "";
        
        if(nome instanceof String){
         System.out.println("É String");   
        }else{
            System.out.println("Não é String");
        }
    }
    
}
