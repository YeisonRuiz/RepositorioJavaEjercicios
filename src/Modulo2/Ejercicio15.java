/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2;

import java.util.Scanner;

/**
 *
 * @author YEISON
 */
public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        String cliente;
        int cantidad;
        int total;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese nombre del cliente?");
        cliente = escaner.nextLine();
        
        System.out.println("Ingrese la cantidad de llantas compradas?");
        cantidad = escaner.nextInt();
        
        if (cantidad < 12) {
            
            total = cantidad * 300;
            
            System.out.println("El cliente: " + cliente);
            System.out.println("El total a pagar es: " + total);
            
        }else{
            
            total = cantidad * 280;
           
            System.out.println("El cliente: " + cliente);
            System.out.println("El total a pagar es: " + total);

        }
        
        
    }
    
}
