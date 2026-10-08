package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Carro kwid = new Carro();
        kwid.modelo = "kwid";
        kwid.velocidade = 30;

        kwid.exibirVelocidade();
        kwid.acelerar(50);
        kwid.exibirVelocidade();
        kwid.frear(60);
        kwid.exibirVelocidade();
    }
}
