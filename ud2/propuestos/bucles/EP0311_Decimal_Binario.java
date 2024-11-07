/* Realiza un programa que convierta un número entero decimal en su representación binaria. 
Hay que tener en cuenta que desconocemos cuántas cifras tiene el número que introduce el usuario.
Por simplicidad, iremos mostrando el número binario con un digito por línea. */

package ud2.propuestos.bucles;
import java.util.Scanner;

public class EP0311_Decimal_Binario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número en base decimal: ");
        int decimal = scanner.nextInt();
        scanner.close();
        String binario = "";

        while (decimal / 2 > 0){
            binario = (decimal % 2) + binario;
            decimal = decimal / 2;
        }
        binario = decimal + binario;

        System.out.println(binario);
    }
}
