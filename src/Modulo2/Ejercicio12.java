/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2;

import java.util.Scanner;


public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        String persona, sexo;
        int edad;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese nombre");
        persona = escaner.next();
        
        System.out.println("Ingrese edad");
        edad = escaner.nextInt();      
        
        System.out.println("Ingrese sexo");
        sexo = escaner.next();
        
        
        if (edad >= 18 && sexo.equalsIgnoreCase("Masculino")) {
            
            System.out.println("La persona es: " + persona);
        }
        else{
        
            System.out.println("La persona no cumple con los requisitos");
        }
        
        
    }
    
}
