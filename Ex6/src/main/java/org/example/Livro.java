package org.example;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    String emprestado;

    void emprestar(){
            System.out.println("Situação: Emprestado");
    }
    void devolver(){
            System.out.println("Situação: Devolvido");
    }
    void exibirInformacoes(){
        System.out.printf("Livro titulo: %s\n", titulo);
        System.out.printf("Livro autor: %s\n", autor);
        System.out.printf("Livro número de páginas: %d\n", numeroPaginas);
    }
}
