package dev.lucaslowhan.exercicio1.test;

import dev.lucaslowhan.exercicio1.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Porshe");
        carro.setModelo("912S Turbo");
        carro.setAno(2024);
        carro.setCor("Preto");
        carro.exibirInformacoes();
    }
}
