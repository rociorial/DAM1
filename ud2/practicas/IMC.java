package ud2.practicas;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso = 0;
        int altura = 0;

        // Validar entrada de peso
        while (true) {
            System.out.print("Introduce tu peso en kg (entre 20 y 300): ");
            if (scanner.hasNextDouble()) {
                peso = scanner.nextDouble();
                if (peso >= 20 && peso <= 300) break;
                else System.out.println("El peso debe estar entre 20 y 300 kg.");
            } else {
                System.out.println("Entrada inválida. Por favor, introduce un número.");
                scanner.next(); // Limpiar la entrada inválida
            }
        }

        // Validar entrada de altura
        while (true) {
            System.out.print("Introduce tu altura en cm (entre 50 y 250): ");
            if (scanner.hasNextInt()) {
                altura = scanner.nextInt();
                if (altura >= 50 && altura <= 250) break;
                else System.out.println("La altura debe estar entre 50 y 250 cm.");
            } else {
                System.out.println("Entrada inválida. Por favor, introduce un número entero.");
                scanner.next(); // Limpiar la entrada inválida
            }
        }

        // Calcular el IMC
        double imcCalculado = imc(peso, altura);

        // Mostrar el resultado
        System.out.printf("Tu IMC es: %.2f%n", imcCalculado);
        System.out.println("Clasificación según la OMS: " + clasificarIMC(imcCalculado));

        scanner.close();
    }
    
    static double imc(double kg, double cm) {
        double alturaMetros = cm / 100.0;
        return kg / (alturaMetros * alturaMetros);
    }

    static String clasificarIMC(double imc) {
        if (imc < 18.50) {
            return "Bajo peso";
        } else if (imc < 25.00) {
            return "Normal";
        } else if (imc < 30.00) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}
