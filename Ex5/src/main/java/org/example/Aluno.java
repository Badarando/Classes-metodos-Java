package org.example;

public class Aluno {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia(){
        return (nota1 + nota2) / 2;
    }

    void exibirSituacao(){
        if (calcularMedia() >= 7){
            System.out.printf("Nome do aluno: %s\nNota: %.2f\nSituação: Aprovado", nome, calcularMedia());
        } else {
            System.out.printf("Nome do aluno: %s\nNota: %.2f\nSituação: Reprovado", nome, calcularMedia());
        }
    }
}
