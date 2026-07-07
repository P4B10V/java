/*
Escribir todos los números del 100 al 0 de 7 en 7.
 */

public class ejercicioNueve {
    public static void main(String[] args){
        int a = 100;
        int b = 0;

        System.out.print(a + " ");

        while (a > b){
            a = a - 7;
            if ( a < 0 ){
                break;
            }
            System.out.print(a + " ");
        }

    }
}
