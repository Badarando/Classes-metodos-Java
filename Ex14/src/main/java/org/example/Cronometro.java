package org.example;

public class Cronometro {
    int segundos;

    void avancar(){
        segundos += 1;
    }
    void avancar(int quantidade){
        segundos += quantidade;
    }
    void zerar(){
        segundos = 0;
    }
    void exibirTempo(){
        int minutos = segundos / 60;
        int segundos = this.segundos % 60;
        System.out.printf("Minutos: %d\n",minutos);
        System.out.printf("Segundos: %d",segundos);
    }

}
