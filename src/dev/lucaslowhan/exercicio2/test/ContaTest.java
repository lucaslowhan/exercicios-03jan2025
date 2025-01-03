package dev.lucaslowhan.exercicio2.test;

import dev.lucaslowhan.exercicio2.dominio.ContaBancaria;

public class ContaTest {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta("0001");
        conta.depositar(2000.00);
        conta.exibirSaldo();
        conta.depositar(1500.00);
        conta.sacar(5000);
    }
}
