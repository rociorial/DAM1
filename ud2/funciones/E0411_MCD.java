/* Escribir una función que calcule de forma recursiva el máximo común divisor de dos números. 
Para ello sabemos:

mcd(a,b) = 
	mcd(a - b, b)	si a >= b
	mcd(a, b - a)	si b > a
	a	        	si b = 0
	b			    si a = 0                                                                */

public class E0411_MCD {

    public static int mcd(int a, int b) {
        if (b == 0) {
            return a; // Caso base: cuando b es 0, el MCD es a
        }
        if (a == 0) {
            return b; // Caso base: cuando a es 0, el MCD es b
        }
        if (a >= b) {
            return mcd(a - b, b); // Reducir a por b
        } else {
            return mcd(a, b - a); // Reducir b por a
        }
    }

    public static void main(String[] args) {
        int a = 56;
        int b = 98;

        System.out.println("El MCD de " + a + " y " + b + " es: " + mcd(a, b));
    }
}
