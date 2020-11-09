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
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        double precio_producto, total;
        
        final double iva = 0.21;
        
        Scanner escaner = new Scanner(System.in);
        
        
        System.out.println("Digite el precio del producto?");
        precio_producto = escaner.nextDouble();
        
        total = precio_producto + (precio_producto*iva);
        
        System.out.println("El precio del producto es: " + total);
        
    }
    
}
