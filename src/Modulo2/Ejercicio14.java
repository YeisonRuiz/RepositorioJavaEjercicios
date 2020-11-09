/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2;

import java.util.Scanner;

/**
 *
 * @author YEISON
 */
public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        double nota1, nota2, nota3, promedio;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese nota 1");
        nota1 = escaner.nextDouble();
        
        System.out.println("Ingrese nota 2");
        nota2 = escaner.nextDouble();
        
        System.out.println("Ingrese nota 3");
        nota3 = escaner.nextDouble();
        
        promedio = (nota1 + nota2 + nota3) / 3;
        
        promedio = Math.round(promedio * 100.00) / 100.00;
        
        if (promedio > 10.5) {
            
            System.out.println("Aprueba");
            System.out.println("Su nota es: " + promedio);
            
        }
        
    }
    
}
