package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Funcionario f = new Funcionario();
        f.nome = "Marcos";
        f.salario = 1800;
        f.aumentarSalario(12);
        f.exibirDados();
    }
}
