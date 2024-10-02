package ejercicios.expresiones;

public class Ejercicio9 {
    public static void main(String[] args) {

        int x = 5;
        int resultado = ++x * 2;
        // Se incrementa +1 a la x antes de la multiplicación

        int x2 = 5;
        int resultado2 = x2++ * 2;
        // Se incrementa +1 a la x después de la multiplicación, x2 = 6, pero no afecta en el resutlado


        System.out.println("Resultado: " + resultado);
        System.out.println("Resultado: " + resultado2);
    }
}
