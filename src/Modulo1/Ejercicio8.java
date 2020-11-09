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
public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        double pedro, jorge, maria;
        double total;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese cuanto dinero tiene Pedro");
        pedro = escaner.nextDouble();
        
        jorge = pedro / 2;
        
        maria = (pedro + jorge) / 2;
        
        total = pedro + jorge + maria;
        
        System.out.println("Pedro tiene: " + pedro);
        System.out.println("Jorge tiene: " + jorge);
        System.out.println("Maria tiene: " + maria);
        
        System.out.println("----------------------");
        
        System.out.println("El total es: " + total);
        
        
        
        
    }
    
}
