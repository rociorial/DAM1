/* Escribir una función a la que se le pasan dos enteros y muestre 
todos los números comprendidos entre ellos. */

package ud2.funciones;
import java.util.Scanner;

public class E0402 {
    public static void mostrarNumeros(int num1, int num2) {
        for(int i = num1 + 1; i < num2; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce otro número: ");
        int num2 = scanner.nextInt();
        scanner.close();

        mostrarNumeros(num1, num2);
    }
}
