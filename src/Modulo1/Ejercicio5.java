/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo1;

import java.util.Scanner;

/**
 *
 * @author YEISON
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        double nota1, nota2, nota3, nota4;
        double promedio;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese la nota 1?");
        nota1 = escaner.nextDouble();
                
        System.out.println("Ingrese la nota 2?");
        nota2 = escaner.nextDouble();

        System.out.println("Ingrese la nota 3?");
        nota3 = escaner.nextDouble();
        
        System.out.println("Ingrese la nota 4?");
        nota4 = escaner.nextDouble();
        
        promedio = nota1 * 0.20 + nota2 * 0.20 + nota3 * 0.30 + nota4 * 0.30;
                
        System.out.println("El promedio es: " + promedio);
                
        
        


        
        
        
    }
    
}
