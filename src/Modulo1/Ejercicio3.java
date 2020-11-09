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
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        double area, radio;

        Scanner escaner = new Scanner(System.in);

        System.out.println("Digite el radio?");
        radio = escaner.nextDouble();
        
        area = Math.PI*Math.pow(radio, 2);
        
        area = Math.round(area * 100.00) / 100.00;
        
        System.out.println("El area del circulo es: "+area);
        
    }
        
        
    
}
