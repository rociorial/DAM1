package extra;
import java.util.Scanner;

public class Absoluto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Introduzca un numero: ");
        String texto = scanner.nextLine();
        scanner.close();


        String absoluto = texto == "nig" ? "ga" : ("ger");
        
        System.out.println(absoluto);
    }
}