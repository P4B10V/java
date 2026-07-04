/*
Pedir dos números y decir si son iguales o no.
 */
import java.util.Scanner;
public class ejercicioCuatro {
    public static void main(String[] args) {
        double a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        a = input.nextDouble();
        System.out.println("Introduce el segundo número: ");
        b = input.nextDouble();
        if (a != b){
            System.out.println("Los números son distintos.");
        } else {
            System.out.println("Los números son iguales");
        }
    }
}
