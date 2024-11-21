package ud2.propuestos.funciones;

import java.util.Scanner;

public class EP0413 {
    public static void muestraPares(int n) {
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }    
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introoduce un número: ");
        int n = scanner.nextInt();
        scanner.close();

        muestraPares(n);
    }
}
