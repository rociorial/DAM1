/* Diseñar la función eco() a la que se le pasa como parámetro un número n, 
y muestra por pantalla n veces el mensaje “Eco…”. */

package ud2.funciones;
import java.util.Scanner;

public class E0401 {
    public static void eco(int n) {
        for(int i = 0; i < n; i++){
            System.out.println("Eco...");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int n = scanner.nextInt();
        scanner.close();

        eco(n);
    }
}
