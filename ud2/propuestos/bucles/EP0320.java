/*  Escribe un programa que solicite al usuario las distintas cantidades de dinero de
las que dispone. Por ejemplo: la cantidad de dinero que tiene en el banco, en una hucha, en
un cajón y en los bolsillos. La aplicación mostrará la suma total de dinero de la que dispone
el usuario.
La manera de especificar que no se desea introducir más cantidades es mediante el cero. */

package ud2.propuestos.bucles;
import java.util.Scanner;

public class EP0320 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;

        double huchaTotal = 0;
        double bancoTotal = 0;
        double cajonTotal = 0;
        double bolsillosTotal = 0;

        double banco;
        double hucha;
        double cajon;
        double bolsillos;

        // Dinero en el banco
        do {
            System.out.print("Introduce la cantidad de dinero en el banco (0 para salir): ");
            banco = scanner.nextDouble();
            bancoTotal += banco; 
        } while (banco != 0);
        System.out.println();

        do {
            System.out.print("Introduce la cantidad de dinero en la hucha (0 para salir): ");
            hucha = scanner.nextDouble();
            huchaTotal += hucha;
        } while (hucha != 0);
        System.out.println();

        do {
            System.out.print("Introduce la cantidad de dinero en el cajón (0 para salir): ");
            cajon = scanner.nextDouble();
            cajonTotal += cajon;
        } while (cajon != 0);
        System.out.println();

        do {
            System.out.print("Introduce la cantidad de dinero en los bolsillos (0 para salir): ");
            bolsillos = scanner.nextDouble();
            bolsillosTotal += bolsillos;
        } while (bolsillos != 0);
        System.out.println();

        scanner.close();

        total = bancoTotal + huchaTotal + cajonTotal + bolsillosTotal;

        System.out.println("Dinero total acumulado en el banco: " + bancoTotal);
        System.out.println("Dinero total acumulado en la hucha: " + huchaTotal);
        System.out.println("Dinero total acumulado en el cajón: " + cajonTotal);
        System.out.println("Dinero total acumulado en los bolsillos: " + bolsillosTotal);

        System.out.println("\nDinero total acumulado: " + total);
    }
}
