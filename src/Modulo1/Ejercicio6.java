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
public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        String estudiante;
        double nota1, nota2, nota3;
        double promedio;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del estudiante?");
        estudiante = escaner.nextLine();
        
        System.out.println("Ingrese nota 1");
        nota1 = escaner.nextDouble();
        
        System.out.println("Ingrese nota 2");
        nota2 = escaner.nextDouble();
        
        System.out.println("Ingrese nota 3");
        nota3 = escaner.nextDouble();
        
        
        promedio = (nota1 + nota2 + nota3) / 3;
        
        promedio = Math.round(promedio);
        
        
        
        System.out.println("El estudiante: " + estudiante);
        System.out.println("El promedio es: " + promedio);
        

        
        
    }
    
}
