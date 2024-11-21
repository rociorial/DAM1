/* Diseñar una función recursiva que calcule el enésimo término de la serie de Fibonacci. En esta serie el enésimo valor se calcula sumando los dos valores anteriores de la serie, es decir:

fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
fibonacci(1) = 1
fibonacci(0) = 1 */

package ud2.funciones;

public class E0412_Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); 
        }
    }   

    public static void main(String[] args) {
        int n = 10;
        System.out.println("El término " + n + " de la serie de Fibonacci es: " + fibonacci(n));
    }
}
