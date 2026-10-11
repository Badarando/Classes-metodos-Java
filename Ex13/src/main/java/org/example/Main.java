package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Lampada l = new Lampada();
        l.ligada = false;
        l.exibirEstado();
        l.ligar();
        l.desligar();
        l.alternar();
        l.alternar();
        l.alternar();
        l.exibirEstado();
    }
}
