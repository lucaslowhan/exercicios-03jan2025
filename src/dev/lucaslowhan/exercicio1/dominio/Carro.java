package dev.lucaslowhan.exercicio1.dominio;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;



    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public void ligar(){
        System.out.println("O carro está ligado.");
    }
    public void desligar(){
        System.out.println("O carro está desligado.");
    }
    public void exibirInformacoes(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Cor: " + getCor());
    }
}
