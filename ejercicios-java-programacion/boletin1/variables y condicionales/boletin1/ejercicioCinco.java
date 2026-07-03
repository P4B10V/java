/*
Pedir un número e indicar si es positivo o negativo.
 */
import java.util.Scanner;

public class ejercicioCinco {
    public static void main(String[] args){
        int a;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un número");
        a = input.nextInt();

        if (a > 0) {
            System.out.println("Es positivo");
        } else if (a < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }
    }
}
