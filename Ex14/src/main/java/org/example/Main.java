package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Cronometro c = new Cronometro();
        c.segundos = 0;
        c.avancar();
        c.avancar();
        c.avancar();
        c.avancar();
        c.avancar();
        c.avancar(145);
        c.exibirTempo();
    }
}
