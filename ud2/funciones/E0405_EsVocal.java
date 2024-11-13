/* Crear una función que, mediante un booleano, indique si el carácter que
se le pasa como parámetro de entrada corresponde a una vocal. */

package ud2.funciones;
import java.util.Scanner;

public class E0405_EsVocal {
    public static boolean EsVocal (char caracter) {

        caracter = Character.toLowerCase(caracter); // Cambiar todo carácter a minúsculas
    
        boolean esVocal = false;

        if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
            esVocal = true;
        }

        return esVocal;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIntroduzca un carácter: ");
        char letra = scanner.next().charAt(0);
        scanner.close();

        if(EsVocal(letra)){
            System.out.println(letra + " es una vocal");
        }else{
            System.out.println(letra + " no es una vocal");
        }
        System.out.println();
    }
}
