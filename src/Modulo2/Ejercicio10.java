/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2;

import java.util.Scanner;


public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        int numero1, numero2;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        numero1 = escaner.nextInt();
        
        System.out.println("Ingrese un numero");
        numero2 = escaner.nextInt();
        
        if(numero1 > numero2){
        
            System.out.println("El numero mayor es: " + numero1);
            
        }else if(numero2 > numero1){
        
            System.out.println("El numero mayor es: " + numero2);
        
        }else{
        
            System.out.println("Los numeros son iguales");
        }
        
        
    }
    
}
