/*
 Igual que el anterior pero suponiendo que no se introduce el precio por litro. Solo existen tres
productos con precios:
1- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro.
 */


import java.util.Scanner;

public class ejercicioDieciocho {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        int litros, contadorPrecio = 0, facturaUno = 0, codigo;
        float precio = 0;
        float facturacionTotal = 0;

        for (int x = 1; x <= 5; x++){
            System.out.println("Factura " + x);
            System.out.println("Introduce código de factura: ");
            codigo = i.nextInt();
            System.out.println("Cuantos litros se vendieron: ");
            litros = i.nextInt();

            if (codigo == 1){
                precio = 0.6F;
            } else if (codigo == 2){
                precio = 3F;
            } else if (codigo == 3){
                precio = 1.25F;
            }

            if (precio * litros > 600){
                contadorPrecio++;
            }

            if (x == 1){
                facturaUno = litros;
            }

            facturacionTotal += (precio * litros);

        }

        System.out.println(facturacionTotal + " euros se ha facturado en total.");
        System.out.println(contadorPrecio + " facturas de mas de 600 euros.");
        System.out.println(facturaUno + " litros se vendieron en el articulo 1");
    }
}
