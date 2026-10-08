package org.example;

public class Funcionario {
    String nome;
    double salario;

    void aumentarSalario(double percentual){
        salario += ((salario * percentual) / 100) ;
        System.out.printf("%.2f\n", salario);
    }

    double calcularSalarioAnual(){
        return salario * 12;
    }

    void exibirDados(){
        System.out.printf("Salário atual: %.2f\n", salario);
        System.out.printf("Salário anual: %.2f", calcularSalarioAnual());

    }
}
