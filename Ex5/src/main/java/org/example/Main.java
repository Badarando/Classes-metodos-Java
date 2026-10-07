package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        Aluno Marcos = new Aluno();

        System.out.println("Digite o nome do Aluno: ");
        Marcos.nome = leitor.nextLine();

        System.out.println("Digite a primeira nota do Aluno: ");
        Marcos.nota1 = leitor.nextDouble();

        System.out.println("Digite a segunda nota do Aluno: ");
        Marcos.nota2 = leitor.nextDouble();

        Marcos.calcularMedia();
        Marcos.exibirSituacao();
    }
}
