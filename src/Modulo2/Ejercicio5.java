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
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        int numero1, numero2;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        numero1 = escaner.nextInt();
        
        System.out.println("Ingrese otro numero");
        numero2 = escaner.nextInt();
        
        if(numero1%2==0 && numero2%2==0){
            
            System.out.println("el numero " + numero1 + " y el numero " + numero2 + " son pares");
        }
        else{
        
            System.out.println("Son impares");
        }
        
        
    }
    
}
