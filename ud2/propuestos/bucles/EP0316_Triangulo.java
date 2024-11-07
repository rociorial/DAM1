/* Solicita al usuario un número n y dibuja un triángulo de base y altura n,
de la forma (para n igual a 4):
*
* *
* * *
* * * *                                                                    */

package ud2.propuestos.bucles;
import java.util.Scanner;

public class EP0316_Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();

        for(int i = 0; i < numero; i++){
            for(int j = 0; j < i; j++){
                for(int k = 0; k < j; k++){
                    System.out.println(" ");
                }
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
