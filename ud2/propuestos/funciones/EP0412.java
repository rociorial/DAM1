/* Implementa la función

static double distancia (double x1, double y1, double x2, double y2)

que calcula y devuelve la distancia euclídea que separa los puntos (x1, y1) y (x2, y2). 
La fórmula para calcular esta distancia es:

distancia = (x1 - x2)² + (y1 - y2)² */

package ud2.propuestos.funciones;

public class EP0412 {
    public static double distancia(double x1, double y1, double x2, double y2) {
        
        double distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        return distancia;
    }
    
}
