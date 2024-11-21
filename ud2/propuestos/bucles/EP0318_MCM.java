/* De forma similar a la actividad anterior (EP0317), implementa un algoritmo
que calcule el minimo común múltiplo de dos números dados. 

MCM: |a x b| / (MCD(a, b)) */

package ud2.propuestos.bucles;

import java.util.Scanner;

public class EP0318_MCM {

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números para calcular su MCM: ");
        int a = scanner.nextInt(); 
        int b = scanner.nextInt();
        scanner.close();

        int mcd = calcularMCD(a, b);
        int mcm = Math.abs(a * b) / mcd;

        System.out.printf("MCM(%d, %d) = %d\n", a, b, mcm);
    }
}
