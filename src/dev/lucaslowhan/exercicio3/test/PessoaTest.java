package dev.lucaslowhan.exercicio3.test;

import dev.lucaslowhan.exercicio3.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Lucas Lowhan");
        pessoa.setIdade(31);
        pessoa.setCpf("11111111111");
        pessoa.exibirDados();
        pessoa.fazerAniversario();
        pessoa.exibirDados();
    }
}
