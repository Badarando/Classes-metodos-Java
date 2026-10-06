package Ex1;

public class Numero {
    int valor;

    void analisar(){
        if(valor == 0){
            System.out.println("Zero");
        } else if (valor > 0){
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }
}
