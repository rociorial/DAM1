/* Crea un programa que solicite al usuario su edad y muestre si es o 
no mayor de edad imprimiendo un literal booleano: true o false. */


package operadores;
import java.util.Scanner;

public class E0108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        scanner.close();
<<<<<<< HEAD

=======
        
>>>>>>> 159dfbdb99a25aae6628a573174e08e26a9e37b9
        System.out.println("Eres mayor de edad");
        boolean mayoriaedad = edad >= 18;
        System.out.println(mayoriaedad);
    }
}
