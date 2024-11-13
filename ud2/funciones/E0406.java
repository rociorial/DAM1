/* Diseñar una función con el siguiente prototipo:

boolean esPrimo(int n)

que devolverá true si n es primo y false en caso contrario. */

package ud2.funciones;
import java.util.Scanner;

public class E0406 {
    public static boolean esPrimo(int n) {

        boolean primo = true;

        if (n == 2){
            primo = true;
        }

        if (n > 2){ 
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    primo = false;
                }
            }
        }

        return primo;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int n = scanner. nextInt();
        scanner.close();

        System.out.printf("%d es %sprimo\n", n, esPrimo(n) ? "" : "no ");
    }
}
