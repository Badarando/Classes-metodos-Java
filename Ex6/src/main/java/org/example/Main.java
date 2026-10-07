package org.example;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Livro l = new Livro();

        System.out.println("Digite o título do livro: ");
        l.titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro: ");
        l.autor = scanner.nextLine();

        System.out.println("Digite o número de páginas do livro: ");
        l.numeroPaginas = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Emprestar ou devolver livro? ");
        l.emprestado = scanner.nextLine();

        l.exibirInformacoes();

        if (l.emprestado.equals("emprestar")){
            l.emprestar();
        } else {
            l.devolver();
        }
    }
}
