package org.example;

public class Retangulo {
    double largura;
    double altura;

    double calcularArea(){
        return altura * largura;
    }

    double cacularPerimetro(){
        return 2 * largura + 2 * altura;
    }

    void exibirDados(){
        System.out.printf("Área do retângulo: %.2f\n", calcularArea());
        System.out.printf("Perimetro do retângulo: %.2f", cacularPerimetro());
    }
}
