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
public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        double a, b;
        double resultado;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Digite la variable A?");
        a = escaner.nextDouble();
        
        System.out.println("Digite la variable B?");
        b = escaner.nextDouble();
        
        resultado = Math.pow(a, 2) + Math.pow(b, 2) + 2*(a*b);
        
        //resultado = a*a + b*b + 2*(a+b);
        
        
        System.out.println("El resultado es: " + resultado);
        
    }
    
}
