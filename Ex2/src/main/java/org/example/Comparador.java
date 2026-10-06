package org.example;
import java.util.Random;

public class Comparador {
    int num1;
    int num2;

    int maior(){
        if(num1 > num2){
            System.out.println("o primeiro é maior: " + num1);
            return num1;
        } else if(num1 < num2) {
            System.out.println("O segundo é maior: " + num2);
            return num2;
        } else {
            return sortear(num1, num2);
        }
    }

    int sortear(int primeiro, int segundo) {
        Random rand = new Random();
        
        if(rand.nextBoolean()) {
            System.out.println("Foi escoliho o primeiro valor");
            return primeiro;
        } else {
            System.out.println("Foi escolhido o segundo valor");
            return segundo;
        }
    }
}
