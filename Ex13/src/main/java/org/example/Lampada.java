package org.example;

public class Lampada {
    boolean ligada;

    void ligar(){
        if(ligada == false){
            ligada = true;
            System.out.println("Lâmpada ligada!");
        }
    }
    void desligar(){
        if(ligada == true){
            ligada = false;
            System.out.println("Lâmpada desligada!");
        }
    }
    void alternar(){
        if(ligada == true){
            ligada = false;
            System.out.println("Lâmpada foi desligada");
        } else
            ligada = true;
            System.out.println("Lâmpada foi ligada");
    }
    void exibirEstado(){
        if(ligada == true){
            System.out.println("A lâmpada está ligada");
        } else{
            System.out.println("A lâmpada está desligada");
        }

    }
}
