import java.util.Random;
import java.util.Scanner;

public class RuletaRusa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido a la Ruleta Rusa.");
        System.out.println("La ruleta tiene 6 posiciones, y una de ellas dispara.");
        
        // Determinar posición de disparo (1 de 6)
        int posicionDisparo = random.nextInt(6) + 1;
        
        // Comienza la ruleta con 6 posiciones
        for (int posicion = 1; posicion <= 6; posicion++) {
            System.out.println("\nPosición del tambor: " + posicion);
            System.out.print("Presiona Enter para apretar el gatillo...");
            scanner.nextLine(); // Espera a que el usuario presione Enter
            
            // Verificar si la posición actual es la que dispara
            if (posicion == posicionDisparo) {
                System.out.println("¡BANG! Has perdido.");
                break;
            } else {
                System.out.println("Clic. Nada sucedió, estás a salvo... por ahora.");
            }
            
            // Si se llega a la última posición sin disparar
            if (posicion == 6) {
                System.out.println("\n¡Felicidades! Has sobrevivido la ronda de ruleta rusa.");
            }
        }
        
        scanner.close();
    }
}
