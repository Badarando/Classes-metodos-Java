package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Pedido p = new Pedido();
        p.produto = "Teclado";
        p.quantidade = 2;
        p.precoUnitario = 150;
        p.calcularTotal();
        p.exibirResumo();
    }
}
