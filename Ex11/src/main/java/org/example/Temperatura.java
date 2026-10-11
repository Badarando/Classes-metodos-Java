package org.example;

public class Temperatura {
    double celsius;

    double converterParaFahrenheit(){
        return celsius * 1.8 + 32;
    }
    double converterParaKelvin(){
        return celsius + 273.15;
    }
    void exibirConversoes(){
        System.out.println("Temperatura em celsius: " + celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f\n", converterParaFahrenheit());
        System.out.printf("Temperatura em Kelvin: %.2f", converterParaKelvin());
    }
}
