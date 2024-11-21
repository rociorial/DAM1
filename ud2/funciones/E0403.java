/* Realizar una función que calcule y muestre el área o el volumen de un cilindro, 
según se especifique. Para distinguir un caso de otro se le pasará como opción un 
número: 1 (para el área) o 2 (para el volumen). Además, hay que pasarle a la 
función el radio de la base y la altura.

área = 2pi * radio * (altura + radio)
volumen = pi * radio2 * altura */

package ud2.funciones;
import java.util.Scanner;
import java.lang.Math;

public class E0403 {
    public static double areaCilindro(int radio, int altura) {
        double PI = Math.PI;

        double area = 2 * PI * radio * (altura + radio);
        
        return area;
    }

    public static double volumenCilindro(int radio, int altura) {
        double PI = Math.PI;

        double volumen = PI * radio * radio * altura;
        
        return volumen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MENÚ DE OPERACIONES");
        System.out.println("1. Área del cilindro");
        System.out.println("2. Volumen del cilindro");
        System.out.print("Introduzca su respuesta: ");
        int respuesta  = scanner.nextInt();
        System.out.println();

        System.out.print("Introduzca el radio de la base del cilindro: ");
        int radio = scanner.nextInt();
        System.out.print("Introduzca la altura del cilindro: ");
        int altura = scanner.nextInt();
        System.out.println();
        scanner.close();


        switch (respuesta) {
            case 1:
                System.out.println(areaCilindro(radio, altura)); 
                break;
            case 2: 
                System.out.println(volumenCilindro(radio, altura));    
                break;
            default:
                System.out.println("No has introducido un número válido.");
                break;
        }
    }
}
