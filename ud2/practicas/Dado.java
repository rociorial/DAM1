package ud2.practicas;

import java.util.Random;

public class Dado {
    // Constante: Número de lanzamientos del dado
    private static final int NUM_LANZAMIENTOS = 1000;

    public static void main(String[] args) {
        Random random = new Random();

        // Contadores para cada cara del dado
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;

        // Realizar los lanzamientos
        for (int i = 0; i < NUM_LANZAMIENTOS; i++) {
            int lanzamiento = random.nextInt(6) + 1; // Generar número aleatorio entre 1 y 6
            switch (lanzamiento) {
                case 1 -> contador1++;
                case 2 -> contador2++;
                case 3 -> contador3++;
                case 4 -> contador4++;
                case 5 -> contador5++;
                case 6 -> contador6++;
            }
        }

        // Mostrar los resultados
        System.out.println("LANZADO UN DADO " + NUM_LANZAMIENTOS + " VECES");
        System.out.printf("Ha salido 1: %d veces ( %.2f%% )%n", contador1, (contador1 * 100.0) / NUM_LANZAMIENTOS);
        System.out.printf("Ha salido 2: %d veces ( %.2f%% )%n", contador2, (contador2 * 100.0) / NUM_LANZAMIENTOS);
        System.out.printf("Ha salido 3: %d veces ( %.2f%% )%n", contador3, (contador3 * 100.0) / NUM_LANZAMIENTOS);
        System.out.printf("Ha salido 4: %d veces ( %.2f%% )%n", contador4, (contador4 * 100.0) / NUM_LANZAMIENTOS);
        System.out.printf("Ha salido 5: %d veces ( %.2f%% )%n", contador5, (contador5 * 100.0) / NUM_LANZAMIENTOS);
        System.out.printf("Ha salido 6: %d veces ( %.2f%% )%n", contador6, (contador6 * 100.0) / NUM_LANZAMIENTOS);
    }
}
