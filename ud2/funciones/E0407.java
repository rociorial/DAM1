/* Escribir una función a la que se le pase un número entero y devuelva el número
de divisores primos que tiene. */

package ud2.funciones;

public class E0407 {
    public static boolean esPrimo(int n) {

        boolean primo = true;

        if (n == 2){
            primo = true;
        }

        if (n > 2){ 
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    primo = false;
                }
            }
        }

        return primo;
    }
    public static void main(String[] args) {
        
    }

    public static void main(String[] args) {
        
    }
    
}
