package org.example;

public class Filme {
    String titulo;
    int duracaoMinutos;

    void exibirDuracaoEmHoras(){
        int hora;
        int minuto;
        hora = duracaoMinutos / 60;
        minuto = duracaoMinutos % 60;
        System.out.printf("%d horas e %d minutos", hora, minuto);
    }
    void exibirInformacoes(){
        System.out.printf("Filme: %s\n", titulo);
        System.out.print("Duração: ");
        exibirDuracaoEmHoras();

    }

}
