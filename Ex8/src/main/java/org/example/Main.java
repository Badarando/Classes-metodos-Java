package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Circulo c = new Circulo();
        c.raio = 5;
        System.out.println(String.format("%.2f", c.calcularArea()));
        System.out.println(String.format("%.2f", c.calcularCircunferencia()));
    }
}
