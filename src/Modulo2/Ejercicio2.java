
package Modulo2;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        int numero;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero?");
        numero = escaner.nextInt();
        
        if (numero == 10) {
            
            System.out.println("El numero ingresado es igual a " + numero);
            
        } else {
            
            System.out.println("El numero ingresado es diferente a 10");

        }
        
        
    }
    
}
