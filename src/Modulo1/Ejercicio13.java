
package Modulo1;

import java.util.Scanner;

/**
 *
 * @author YEISON
 */
public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        int horas;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de horas a calcular?");
        horas = escaner.nextInt();
        
        int semana = horas / 168;
        int dias = horas%168 / 24;
        int horasCalculas = horas%24;
        
        System.out.println("El numero horas digitado es: " + horas);
        System.out.println("-------------------------------");
        System.out.println("El numero total de semana es: " + semana);
        System.out.println("El numero total de dias es: " + dias);
        System.out.println("El numero total de horas es: " + horasCalculas);
        
    }
    
}
