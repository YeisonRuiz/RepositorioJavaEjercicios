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
public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        int numero;
        double porcentaje;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero");
        numero = escaner.nextInt();
        
        porcentaje = numero * 0.05;
        
        System.out.println("----------------------");
        
        System.out.println("el numero es: " + numero);
        System.out.println("El numero con el 5%: " + porcentaje);
    }
    
}
