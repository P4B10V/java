/*
Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de
alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75
 */

import java.util.Scanner;

public class ejercicioQuince {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);

        int edad, sumaEdad = 0, mayorEdad = 0, mayorAltura = 0;
        double altura, sumaAltura = 0;

        for (int x = 0 ; x < 5 ; x++){
            System.out.println("Introduce edad del alumno: ");
            edad = i.nextInt();
            sumaEdad += edad;
            if (edad >= 18) {
                mayorEdad++;
            }

            System.out.println("Introduce altura del alumno: ");
            altura = i.nextDouble();
            sumaAltura += altura;

            if (altura > 1.75) {
                mayorAltura++;
            }

        }

        System.out.println("Edad media: " + sumaEdad / 5 );
        System.out.println("Altura media: " + sumaAltura / 5 );
        System.out.println("Mayores de 18: " + mayorEdad);
        System.out.println("Altura mayor de 1.75 : " + mayorAltura);
    }
}
