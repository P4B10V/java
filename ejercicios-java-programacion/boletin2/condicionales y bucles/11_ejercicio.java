/*
 Diseñar un programa que muestre el producto de los 10 primeros números impares.
 */


public class ejercicioOnce {
    public static void main(String[] args){

        int x = 1;
        int producto = 1;
        int contador_impares = 0;

        // son los 10 primeros números impares..

        while (contador_impares < 10){
            if ( x % 2 != 0 ){
                contador_impares += 1;
                producto *= x;
            }

            x++;

        }

        System.out.println(producto);
    }

}
