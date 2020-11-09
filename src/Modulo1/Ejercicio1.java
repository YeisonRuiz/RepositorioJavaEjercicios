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
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        String nombre;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        nombre = escaner.nextLine();
        
        System.out.println("Bienvenido " + nombre);
    }
  
    
}
