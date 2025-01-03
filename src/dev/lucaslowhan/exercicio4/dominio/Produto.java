package dev.lucaslowhan.exercicio4.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public void vender(int quantidade){
        if(quantidade<=quantidadeEmEstoque){
            quantidadeEmEstoque-=quantidade;
            System.out.println("Foram vendidos " + quantidade +" de " + getNome());
        }
        else{
            System.out.println("Quantidade no estoque insuficiente.");
        }
    }
    public void repor(int quantidade){
        quantidadeEmEstoque += quantidade;
        System.out.println("Foi reposto " +quantidade + " itens de " + getNome());
    }
    public void exibirDetalhes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " +getQuantidadeEmEstoque());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }



}
