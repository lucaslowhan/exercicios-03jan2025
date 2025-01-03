package dev.lucaslowhan.exercicio5.test;

import dev.lucaslowhan.exercicio5.dominio.Livro;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("Criando um segundo cerebro.");
        livro.setAutor("Tiago Forte");
        livro.setNumeroDePaginas(300);
        livro.setPreco(100);
        livro.desconto(20);
        livro.exibirDetalhes();
    }
}
