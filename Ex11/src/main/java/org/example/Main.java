package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Temperatura c = new Temperatura();
        c.celsius = 35;
        c.converterParaFahrenheit();
        c.converterParaKelvin();

        c.exibirConversoes();
    }
}
