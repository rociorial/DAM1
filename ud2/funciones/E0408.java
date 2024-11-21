/* Diseñar la función calculadora(), a la que se le pasan dos números reales (operandos) 
y qué operación se desea realizar con ellas. Las operaciones disponibles se especifican 
con un número y son: sumar(1), restar(2), multiplicar(3) o dividir(4). La función devolverá 
el resultado de la operación mediante un número real. */

package ud2.funciones;
import java.util.Scanner;

public class E0408 {
    public static double calculadora(int respuesta, double num1, double num2) {
        switch (respuesta) {
            case 1:
                double suma = num1 + num2; 
                return suma;
            case 2:
                double resta = num1 - num2;
                return resta;
            case 3:
                double multiplicacion = num1 * num2;
                return multiplicacion;
            case 4:
                if(num2 != 0){
                    double division = num1 / num2; 
                    return division;
                }else{
                    System.out.println("No se puede dividir entre 0");
                    return -1;
                }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BIENVENIDO A LA CALCULADORA");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        System.out.print("Introduzca su respuesta: ");
        int respuesta = scanner.nextInt();

        System.out.println();
        System.out.print("Introduzca un número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduzca otro número: ");
        double num2 = scanner.nextDouble();

        scanner.close();
        System.out.println();

        System.out.println(calculadora(respuesta, num1, num2));
    }
}
