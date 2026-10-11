package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Calculadora c = new Calculadora();
        System.out.println(c.somar(2.5, 2.5));
        System.out.println(c.subtrair(9.5, 2.5));
        System.out.println(c.multiplicar(2.5, 2.5));
        System.out.println(String.format("%.2f", c.dividir(10, 0)));
    }
}
