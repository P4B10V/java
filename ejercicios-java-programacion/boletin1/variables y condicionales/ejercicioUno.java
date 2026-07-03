
/*
Pedir los coeficientes de una ecuación de 2º grado, y muestre sus soluciones reales. Si no existen,
debe indicarlo.
*/

/*
Hace bastantes años que no hago matemáticas, por lo que tendré que pensar primero.

Una ecuación de segundo grado por lo que recuerdo es:

Una ecuación de segundo grado representa una parabola en un eje x y, donde las soluciones son donde se corta con este eje x.
Por ello, las ecuaciones de segundo grado pueden tener:
    - 0 soluciones: no se corta
    - 1 solución: se corta una vez
    - 2 soluciones: se corta dos veces

Tiene forma de: ax^2 + bx + c

Para resolverlo se usa:  x = ( -b +-√b^2 - 4ac ) / 2a

Antes de nada tendremos ciertas restricciones, si a == 0 -> no se puede dividir entre 0

Discriminante > 0 dos soluciones
Discriminante = 0 una solucion
Discriminante < 0 no tiene solucion

 */

import java.util.Scanner;

public class ejercicioUno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;
        System.out.print("Introduce el valor de a");
        a = input.nextDouble();

        while (a == 0){
            System.out.println("a no puede ser igual a 0, introduce otro número: ");
            a = input.nextDouble();
        }

        System.out.print("Introduce el valor de b");
        b = input.nextDouble();

        System.out.print("Introduce el valor de c");
        c = input.nextDouble();

        //Calculo discriminante
        double discriminante = b*b - 4*a*c;

        if (discriminante > 0){
            System.out.println("Existen dos posibles soluciones.");
            double x1,x2;
            x1 = ( (-b) + Math.sqrt(discriminante) ) / ( 2*a );
            x2 = ( (-b) - Math.sqrt(discriminante) ) / ( 2*a );
            System.out.println("Las soluciones son: " + x1 + "y " + x2);

        } else if (discriminante < 0) {
            System.out.println("No existen soluciones");
        } else {
            System.out.println("Existe una única solución.");
            double x1;
            x1 = -b / ( 2*a) ;
            System.out.println("La solución es: " + x1);
        }
    }
}
