/* Diseña una función que calcule y muestre la superficie y el volumen de una esfera.

Superficie = 4pi * radio2
Volumen = (4pi / 3) * radio3 */

package ud2.propuestos.funciones;
import java.util.Scanner;

public class EP0411 {
    public static double calcularSuperficie(int radio) {
        double superficie = 4 * Math.PI * radio * radio;
        return superficie;
    }

    public static double calcularVolumen(int radio) {
        double volumen = (4 * Math.PI / 3) * radio * radio * radio;
        return volumen;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el radio de la esfera: ");
        int radio = scanner.nextInt();
        scanner.close();

        System.out.println("Superficie: " + calcularSuperficie(radio));
        System.out.println("Volumen: " + calcularVolumen(radio));
    }
}
