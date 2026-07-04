/*
Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.
 */

import java.util.Scanner;

public class ejercicioVeinte {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int h,m,s;

        System.out.println("Introduce hora: ");
        h = input.nextInt();
        System.out.println("Introduce minutos: ");
        m = input.nextInt();
        System.out.println("Introduce segundos: ");
        s = input.nextInt();

        if ( s == 59){
            if ( m == 59){
                if (h == 23){
                    h = 0;
                    m = 0;
                    s = 0;
                } else {
                    m = 0;
                    s = 0;
                    h++;
                }

            } else {
                m++;
                s = 0;
            }
        } else {
            s ++;
        }

        System.out.println("Son las " + h + ":" + m + ":" + s );

    }
}
