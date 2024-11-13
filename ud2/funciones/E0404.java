/* Diseñar una función que recibe como parámetros dos números enteros y
devuelve el máximo de ambos. */

package ud2.funciones;
import java.util.Scanner;

public class E0404 {

    int num1;
    int num2;

    public static void Maximo(int num1, int num2) {
        if(num1 > num2){
        System.out.println(num1);
        }else if(num1 < num2){
        System.out.println(num2);
        }else{
        System.out.printf("%d = %d", num1, num2);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduzca otro número: ");
        int num2 = scanner.nextInt();
        
        scanner.close();

        Maximo(num1, num2);
    }
    
}
