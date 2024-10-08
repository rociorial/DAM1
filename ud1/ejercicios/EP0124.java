/* Escribe un programa que convierta unidades de volumen entre galones y litros o viceversa. 
El programa solicitará al usuario la cantidad de volumen y la unidad de medida origen (galones o litros).

1 galón = 3.78541 litros

El programa deberá manejar las conversiones automáticamente y mostrar el resultado al usuario. 
Utiliza el operador ternario para evaluar la unidad de medida introducida por el usuario. El programa 
mostrará por pantalla el resultado con la unidad de medida adecuada.*/

package ud1.ejercicios;
import java.util.Scanner;

public class EP0124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        final double galones = 3.78541;
    
        System.out.print("Introduzca la cantidad de volumen: ");
        double volumen = scanner.nextDouble();
        System.out.print("Introduzca la unidad de medida origen (0 para litros y 1 para galones): ");
        int unidadOrigen = scanner.nextInt();

        double volumenFinal = (unidadOrigen == 0) ? (volumen/galones) : (galones/volumen);

        String unidadOrigenStr = (unidadOrigen == 0) ? "litros" : "galones";
        String unidadDestino = (unidadOrigen == 0) ? "galones" : "litros";


        System.out.printf("%3.f %s son %.3f %s", volumen, unidadOrigenStr, volumenFinal, unidadDestino);

        scanner.close();
    }
}
