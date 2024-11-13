import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Bingo {

    public static void main(String[] args) {
        int[][] tarjetaJugador1 = generarTarjetaBingo();
        int[][] tarjetaJugador2 = generarTarjetaBingo();
        Set<Integer> numerosSalidos = new HashSet<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al Bingo!");
        System.out.println("Esta es la tarjeta del Jugador 1:");
        mostrarTarjeta(tarjetaJugador1);

        System.out.println("\nEsta es la tarjeta del Jugador 2:");
        mostrarTarjeta(tarjetaJugador2);

        boolean ganador = false;
        while (!ganador) {
            System.out.print("\nPresiona Enter para sacar un número...");
            scanner.nextLine();

            int numero;
            do {
                numero = random.nextInt(75) + 1; // Genera un número entre 1 y 75
            } while (numerosSalidos.contains(numero)); // Asegura que el número no haya salido antes

            numerosSalidos.add(numero);
            System.out.println("Número sacado: " + numero);

            // Marcar el número en ambas tarjetas
            marcarNumeroEnTarjeta(tarjetaJugador1, numero);
            marcarNumeroEnTarjeta(tarjetaJugador2, numero);

            // Limpiar pantalla (simulación para consolas de sistema operativo)
            limpiarPantalla();

            System.out.println("\nTarjeta del Jugador 1:");
            mostrarTarjeta(tarjetaJugador1);

            System.out.println("\nTarjeta del Jugador 2:");
            mostrarTarjeta(tarjetaJugador2);

            // Verificar si alguno de los jugadores ha ganado
            if (esGanador(tarjetaJugador1)) {
                System.out.println("¡BINGO! ¡El Jugador 1 ha ganado!");
                ganador = true;
            } else if (esGanador(tarjetaJugador2)) {
                System.out.println("¡BINGO! ¡El Jugador 2 ha ganado!");
                ganador = true;
            }
        }

        scanner.close();
    }

    public static int[][] generarTarjetaBingo() {
        Random random = new Random();
        int[][] tarjeta = new int[5][5];

        for (int i = 0; i < 5; i++) {
            Set<Integer> numerosColumna = new HashSet<>();
            for (int j = 0; j < 5; j++) {
                int min = i * 15 + 1;
                int max = i * 15 + 15;
                int numero;

                // Generar número único en el rango correspondiente a la columna
                do {
                    numero = random.nextInt(max - min + 1) + min;
                } while (numerosColumna.contains(numero));

                numerosColumna.add(numero);
                tarjeta[j][i] = numero;
            }
        }

        tarjeta[2][2] = 0; // Casilla central es "libre"
        return tarjeta;
    }

    public static void mostrarTarjeta(int[][] tarjeta) {
        System.out.println(" B   I   N   G   O");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (tarjeta[i][j] == 0) {
                    System.out.print(" *  ");
                } else {
                    System.out.printf("%2d  ", tarjeta[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void marcarNumeroEnTarjeta(int[][] tarjeta, int numero) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (tarjeta[i][j] == numero) {
                    tarjeta[i][j] = 0; // Marca el número como "lleno" (0 representa una casilla marcada)
                }
            }
        }
    }

    public static boolean esGanador(int[][] tarjeta) {
        // Verificar si hay una línea completa en cualquier fila
        for (int i = 0; i < 5; i++) {
            boolean filaCompleta = true;
            for (int j = 0; j < 5; j++) {
                if (tarjeta[i][j] != 0) {
                    filaCompleta = false;
                    break;
                }
            }
            if (filaCompleta) {
                return true;
            }
        }
        return false;
    }

    public static void limpiarPantalla() {
        // Imprimir líneas en blanco (simulación de limpieza)
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
