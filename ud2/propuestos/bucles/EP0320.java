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

        do{
            System.out.print("Introduce la cantidad de dinero en el banco: ");
            banco = scanner.nextDouble();
            bancoTotal = bancoTotal + banco;
        }while (banco != 0);
        System.out.println();

        do{
            System.out.print("Introduce la cantidad de dinero en el hucha: ");
            hucha = scanner.nextDouble();
            huchaTotal = huchaTotal + hucha;
        }while (hucha != 0);
        System.out.println();

        do{
            System.out.print("Introduce la cantidad de dinero en el cajón: ");
            cajon = scanner.nextDouble();
            cajonTotal = cajonTotal + cajon;
        }while (cajon != 0);
        System.out.println();

        do{
            System.out.print("Introduce la cantidad de dinero en el bolsillos: ");
            bolsillos = scanner.nextDouble();
            bolsillosTotal = bolsillosTotal + bolsillos;
        }while (bolsillos != 0);
        System.out.println();
        
        scanner.close();

        System.out.println("Dinero en el banco: " + banco);
        System.out.println("Dinero en la hucha: " + hucha);
        System.out.println("Dinero en el cajón: " + cajon);
        System.out.println("Dinero en los bolsillos: " + bolsillos);

        total = banco + hucha + cajon + bolsillos;

        System.out.println("\nDinero total: " + total);
    }
}
