package org.example;

public class ContaBancaria {
    String titular;
    double saldo;

    void exibirSaldo(){
        System.out.printf("Saldo atual: %.2f\n", saldo);
    }

    void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito realizado com sucesso.");
        exibirSaldo();
    }

    void sacar(double valor){
        saldo -= valor;
        System.out.println("Saque realizado com sucesso.");
        exibirSaldo();
    }


}
