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
public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        String cliente;
        double compra, resultado;
        
        Scanner escaner = new Scanner(System.in);
        
        
        System.out.println("Ingrese nombre del cliente");
        cliente = escaner.nextLine();
        
        System.out.println("Ingrese el monto a pagar en S/?");
        compra = escaner.nextDouble();
        
        if (compra > 300) {
            
            resultado = compra  - (compra * 0.20);
            
            System.out.println("El cliente: " + cliente);
            System.out.println("El monto a pagar es: S/" + resultado);
            
        }else{
            System.out.println("El cliente: " + cliente);
            System.out.println("El monto a pagar es: S/" + compra);
        }
        
        
        
    }
    
}
