/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo1;

import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        String estudiante;
        double participacion, parcial1, parcial2, parcial_final, notafinal;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese nombre del estudiante?");
        estudiante = escaner.nextLine();
        
        System.out.println("Ingrese nota de participacion");
        participacion = escaner.nextDouble();
        
        System.out.println("Ingrese nota de 1~ Parcial");
        parcial1 = escaner.nextDouble();
        
        System.out.println("Ingrese nota de 2 Parcial");
        parcial2 = escaner.nextDouble();
        
        System.out.println("Ingrese nota del Parcial Fina");
        parcial_final = escaner.nextDouble();
        
        participacion *= 0.10;
        parcial1 *= 0.25;
        parcial2 *= 0.25;
        parcial_final *= 0.40;
        
        notafinal = participacion + parcial1 + parcial2 + parcial_final;
        
        System.out.println("------------------------");
        System.out.println("El estudiante: " + estudiante);
        System.out.println("La nota final es: " + notafinal);
        
        
    }
    
}
