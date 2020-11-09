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
public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        double precio_compra, precio_venta;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese el precio de compra de DVD");
        precio_compra = escaner.nextDouble();
        
        precio_venta = precio_compra + (precio_compra * 0.20);
        
        System.out.println("-------------------------");
        System.out.println("El precio de compra es: " + precio_compra);
        System.out.println("El precio a vender es: " + precio_venta);
        
    }
    
}
