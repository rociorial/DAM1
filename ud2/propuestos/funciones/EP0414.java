/* Escribe una función a la que se pase como parámetros de entrada una cantidad de días, 
horas y minutos. La función calculará y devolverá el número de segundos que existen en los 
datos de entrada. */

package ud2.propuestos.funciones;

public class EP0414 {
    public class CalculadoraSegundos {

        public static long calcularSegundos(int dias, int horas, int minutos) {
            long segundosEnDias = (long) dias * 24 * 60 * 60;
            long segundosEnHoras = horas * 60 * 60;
            long segundosEnMinutos = minutos * 60;
    
            long totalSegundos = segundosEnDias + segundosEnHoras + segundosEnMinutos;
            return totalSegundos;
        }
    
        public static void main(String[] args) {
            int dias = 2;
            int horas = 3;
            int minutos = 15;
    
            long segundosTotales = calcularSegundos(dias, horas, minutos);
            System.out.println("Total de segundos: " + segundosTotales);
        }
    }
}
