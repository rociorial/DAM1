/* Repetir la actividad E0404 con una versión que calcule el máximo de tres números enteros. */

package ud2.funciones;
import java.util.Scanner;

public class E0409 {

    public static void maximo(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor número es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor número es: " + num2);
        } else {
            System.out.println("El mayor número es: " + num3);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduzca el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduzca el tercer número: ");
        int num3 = scanner.nextInt();

        scanner.close();

        maximo(num1, num2, num3);
    }
}

