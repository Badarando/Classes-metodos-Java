package org.example;

public class Carro {
    String modelo;
    int velocidade;

    void acelerar(int valor){
        velocidade += valor;
        System.out.println("\ncarro acelerando");
    }

    void frear(int valor){
        velocidade -= valor;
        System.out.println("\ncarro freando");
    }
    void exibirVelocidade(){
        System.out.printf("A velocidade do carro é de: %d km/h", velocidade);
    }
}
