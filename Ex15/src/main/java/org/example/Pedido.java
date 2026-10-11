package org.example;

public class Pedido {
    String produto;
    int quantidade;
    double precoUnitario;

    double calcularTotal(){
        if(quantidade == 0){
            System.out.println("Quantidade nao pode ser igual a zero, digite outro valor");
        }
            return precoUnitario * quantidade;
    }

    void adicionarQuantidade(int quantidade){
        this.quantidade += quantidade;
    }
    void removerQuantidade(int quantidade){
        this.quantidade -= quantidade;
    }
    void exibirResumo(){
        System.out.printf("Nome do produto: %s\n", produto);
        System.out.printf("Quantidade do produto: %d\n", quantidade);
        System.out.printf("Preço unitário: %.2f\n", precoUnitario);
        System.out.printf("Total: %.2f", calcularTotal());

    }
}
