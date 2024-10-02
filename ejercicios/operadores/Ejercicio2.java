package ejercicios.operadores;

public class Ejercicio2 {
    public static void main(String[] args) {

        double a = 2;
        double b = -4;
        double c = -6;

        double discriminante = b * b - 4 * a * c;

        if (discriminante < 0){
            System.out.println("No hay raíces reales.");
        }else{
        double x1= (-b + (Math.sqrt(discriminante)))/ (2*a);
        double x2= (-b - (Math.sqrt(discriminante)))/ (2*a);

        System.out.println("Resultado1: " + x1);
        System.out.println("Resultado2: " + x2);
       }
    }
}
