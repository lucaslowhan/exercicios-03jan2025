package dev.lucaslowhan.exercicio2.dominio;

public class ContaBancaria {
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    private String numeroConta;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de "+ valor +" realizado com sucesso. \nSaldo atual: " + getSaldo());
    }
    public void sacar(double valor){
        if(valor<=saldo){
            saldo-=valor;
            System.out.println("Saque no valor de " + valor + " realizado com sucesso.");
            System.out.println("Saldo atual de " + getSaldo());
        }
        else{
            System.out.println("Saldo insuficiente. Seu saldo é: "+ getSaldo());
        }
    }
    public void exibirSaldo(){
        System.out.println(getSaldo());
    }



}
