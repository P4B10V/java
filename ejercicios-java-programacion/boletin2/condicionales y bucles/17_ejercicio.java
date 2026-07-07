/*
Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las
facturas. En cada factura figura:
    el código del artículo,
    cantidad vendida en litros
    precio por litro.
Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1
y cuantas facturas se emitieron de más de 600 €.
 */

import java.util.Scanner;

public class ejercicioDiecisiete {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        String codigo;
        int facturacionTotal = 0, litros, precio, contadorPrecio = 0, facturaUno = 0;


// Como piden introducir 5 facturas se hará un bucle for
        for (int x = 1; x <= 5; x++){
            System.out.println("Factura " + x);
            System.out.print("Introduce código de factura: ");
            codigo = i.nextLine();
            System.out.print("Cuantos litros se vendieron: ");
            litros = i.nextInt();
            System.out.print("Precio por litro: ");
            precio = i.nextInt();

            if (precio * litros > 600){
                contadorPrecio++;
            }

            if (x == 1){
                facturaUno = litros;
            }

            facturacionTotal += precio * litros;

        }

        System.out.println(facturacionTotal + " euros se ha facturado en total.");
        System.out.println(contadorPrecio + " facturas de mas de 600 euros.");
        System.out.println(facturaUno + " litros se vendieron en el articulo 1");
    }
}
