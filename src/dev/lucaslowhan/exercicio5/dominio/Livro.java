package dev.lucaslowhan.exercicio5.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private double preco;

    public void exibirDetalhes(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: "+ getAutor());
        System.out.println("Número de páginas: " + getNumeroDePaginas());
        System.out.println("Preço: " + getPreco());
    }
    public void desconto(double percentual){
        preco -= preco*percentual/100;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



}
