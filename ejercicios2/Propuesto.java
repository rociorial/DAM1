/* Escribir un programa que calcule el dinero recaudado en un concierto. La aplicación
solicitará el aforo máximo del local, el precio por entrada (suponemos que todas las
entradas tienen el mismo precio) y el número de entradas vendidas. Hay que tener en 
cuenta que si el número de entradas vendidas no supera el 20% del aforo del local, se
cancela el concierto. Si el número de entradas vendidas no supera el 50% del aforo del
local, se realiza una rebaja del 25% del precio de la entrada. */

package ejercicios2;
import java.util.Scanner;

public class Propuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        final double CANCELAR = 0.2; 
        final double REBAJASI = 0.5; 
        final double AREBAJAR = 0.25;

        System.out.print("Introduzca el aforo máximo del concierto: ");
        int aforo = scanner.nextInt();
        System.out.print("Introduzca el precio de la entrada: ");
        int precioEntrada = scanner.nextInt();

        
    }
}
