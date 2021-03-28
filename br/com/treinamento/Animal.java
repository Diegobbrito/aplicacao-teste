package br.com.treinamento;

public class Animal {

    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void imprimirNomeCompleto(){
        System.out.println("Nome: " + this.nome + " " + this.sobrenome);
    }
    
}
