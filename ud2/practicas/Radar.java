package ud2.practicas;

public class Radar {

    public static void main(String[] args) {
        // Ejemplo de uso
        double distancia = 10; // en kilómetros
        int tiempo = 300; // en segundos
        int limite = 110; // en km/h

        int exceso = excesoVelocidade(distancia, tiempo, limite);
        if (exceso == 0) {
            System.out.println("No se superó el límite de velocidad.");
        } else {
            System.out.println("Exceso de velocidad: " + exceso + " km/h.");
        }
    }

    static int excesoVelocidade(double distancia, int tiempo, int limite) {
        // Convertir el tiempo de segundos a horas
        double tiempoHoras = tiempo / 3600.0;

        // Calcular la velocidad media
        double velocidadMedia = distancia / tiempoHoras;

        // Determinar el exceso de velocidad
        if (velocidadMedia > limite) {
            return (int) Math.ceil(velocidadMedia - limite); // Redondear hacia arriba
        } else {
            return 0; // No hay exceso
        }
    }
}
