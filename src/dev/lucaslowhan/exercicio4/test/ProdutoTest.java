package dev.lucaslowhan.exercicio4.test;

import dev.lucaslowhan.exercicio4.dominio.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Iphone 16");
        produto.setPreco(6500.00);
        produto.setQuantidadeEmEstoque(0);
        produto.vender(1);
        produto.repor(10);
        produto.vender(1);
        produto.exibirDetalhes();
    }
}
