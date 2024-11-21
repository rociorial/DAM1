/* Diseñar una función que calcule an, donde a es real y n es entero no negativo. 
Realizar una versión iterativa y otra recursiva. */

package ud2.funciones;

import java.util.Scanner;

public class E0410 {

    // Versión iterativa
    public static double potenciaIterativa(double a, int n) {
        double resultado = 1.0; // Inicializar a 1 porque cualquier número elevado a 0 es 1
        for (int i = 0; i < n; i++) {
            resultado *= a; // Multiplicar por a en cada iteración
        }
        return resultado;
    }

    // Versión recursiva
    public static double potenciaRecursiva(double a, int n) {
        if (n == 0) {
            return 1.0; // Caso base: cualquier número elevado a 0 es 1
        } else {
            return a * potenciaRecursiva(a, n - 1); // Llamada recursiva
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de a (real): ");
        double a = scanner.nextDouble();

        System.out.print("Introduce el valor de n (entero no negativo): ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("El exponente n debe ser un número entero no negativo.");
        } else {
            System.out.println("Resultado (iterativo): " + potenciaIterativa(a, n));
            System.out.println("Resultado (recursivo): " + potenciaRecursiva(a, n));
        }

        scanner.close();
    }
}
