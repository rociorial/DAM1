package ud2.practicas;

import java.util.Random;
import java.util.Scanner;

public class CalculadoraHumana {

    // Constantes del juego
    private static final int NUM_OPERACIONES = 7;
    private static final int MAX_FALLOS = 5;
    private static final int VALOR_MAXIMO = 200;

    // Generador de números aleatorios
    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fallos = 0;
        int aciertos = 0;
        int operando1 = generarNumeroAleatorio(1, VALOR_MAXIMO);

        while (aciertos < NUM_OPERACIONES && fallos < MAX_FALLOS) {
            // Generar operación aleatoria
            char operador = generarOperadorAleatorio();
            int operando2 = generarOperando2(operando1, operador);

            // Calcular el resultado esperado
            int resultadoEsperado = calcularResultado(operando1, operador, operando2);

            // Validar si la operación es válida
            if (resultadoEsperado > VALOR_MAXIMO) continue; // Saltar si el resultado excede el límite

            // Mostrar operación y pedir respuesta al usuario
            System.out.printf("¿Cuánto es %d %c %d?%n", operando1, operador, operando2);

            while (true) {
                try {
                    int respuesta = scanner.nextInt();

                    if (respuesta == resultadoEsperado) {
                        System.out.println("¡Correcto!");
                        aciertos++;
                        break;
                    } else {
                        System.out.println("Incorrecto. Intenta nuevamente:");
                        fallos++;
                        if (fallos >= MAX_FALLOS) break;
                    }
                } catch (Exception e) {
                    System.out.println("Por favor, introduce un número válido.");
                    scanner.next(); // Limpiar entrada inválida
                }
            }

            if (fallos >= MAX_FALLOS) break;

            // Preparar el próximo operando
            operando1 = resultadoEsperado;
        }

        // Mostrar resultados finales
        if (aciertos >= NUM_OPERACIONES) {
            System.out.println("¡Felicidades! Has completado el juego.");
        } else {
            System.out.println("Has alcanzado el límite de fallos. Fin del juego.");
        }

        scanner.close();
    }

    // Genera un número aleatorio dentro del rango especificado
    private static int generarNumeroAleatorio(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    // Genera un operador aleatorio
    private static char generarOperadorAleatorio() {
        char[] operadores = {'+', '-', '*', '/'};
        return operadores[random.nextInt(operadores.length)];
    }

    // Genera un segundo operando válido según la operación
    private static int generarOperando2(int operando1, char operador) {
        switch (operador) {
            case '+':
                return generarOperando2Suma(operando1);
            case '-':
                return generarOperando2Resta(operando1);
            case '*':
                return generarOperando2Multiplicacion(operando1);
            case '/':
                return generarOperando2Division(operando1);
            default:
                return 1; // Por defecto
        }
    }

    // Calcula el resultado de la operación
    private static int calcularResultado(int operando1, char operador, int operando2) {
        return switch (operador) {
            case '+' -> operando1 + operando2;
            case '-' -> operando1 - operando2;
            case '*' -> operando1 * operando2;
            case '/' -> operando1 / operando2;
            default -> 0;
        };
    }

    // Genera un operando válido para la suma
    private static int generarOperando2Suma(int operando1) {
        return generarNumeroAleatorio(1, VALOR_MAXIMO - operando1);
    }

    // Genera un operando válido para la resta
    private static int generarOperando2Resta(int operando1) {
        return generarNumeroAleatorio(1, operando1 - 1);
    }

    // Genera un operando válido para la multiplicación
    private static int generarOperando2Multiplicacion(int operando1) {
        return generarNumeroAleatorio(1, VALOR_MAXIMO / operando1);
    }

    // Genera un operando válido para la división
    private static int generarOperando2Division(int operando1) {
        if (operando1 <= 1) return 1; // No se puede dividir 1 o menos
        for (int i = operando1 - 1; i > 1; i--) {
            if (operando1 % i == 0) return i;
        }
        return 1; // Valor por defecto si no se encuentra divisor
    }
}
