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
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        int numero;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero?");
        numero = escaner.nextInt();
        
        if (numero < 0) {
            
            System.out.println("Usted esta digitando un numero negativo");
            
        }else if(numero < 100){
        
            System.out.println("El numero " + numero + " tiene 1 cifras");

        }else if(numero < 100){
        
            System.out.println("El numero " + numero + " tiene 2 cifras");

        }else if(numero < 1000){
        
            System.out.println("El numero " + numero + " tiene 3 cifras");

        }else if(numero < 10000){
        
            System.out.println("El numero " + numero + " tiene 4 cifras");
            
        }else if(numero < 100000){
        
            System.out.println("El numero " + numero + " tiene 5 cifras");

        }else{
            
            System.out.println("Ustes esta digitando un numero mayor a 99999");
        }
    }
    
}
