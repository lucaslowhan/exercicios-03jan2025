package dev.lucaslowhan.exercicio3.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public void fazerAniversario(){
        idade++;
        System.out.println(nome + ", feliz aniversario." + idade + " anos.");
    }
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Cpf: " + cpf);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
