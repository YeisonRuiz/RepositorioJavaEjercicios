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
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        int numero1, numero2, numero3;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        numero1 = escaner.nextInt();
        
        System.out.println("Ingrese el primer numero");
        numero2 = escaner.nextInt();
        
        System.out.println("Ingrese el primer numero");
        numero3 = escaner.nextInt();
        
        
        if (numero1 > numero2 && numero2 > numero3) {
            
            System.out.println("De mayor a menor: "+ numero1 + " - " + numero2 + " - " + numero3);
            
        }else if( numero1 > numero3 && numero3 > numero2){
            
            System.out.println("De mayor a menor: "+ numero1 + " - " + numero3 + " - " + numero2);

        }else if(numero2 > numero1 && numero1 > numero3){
            
            System.out.println("De mayor a menor: "+ numero2 + " - " + numero1 + " - " + numero3);
            
        }else if(numero2 > numero3 && numero3 > numero1){
            
            System.out.println("De mayor a menor: "+ numero2 + " - " + numero3 + " - " + numero1);

        }else if(numero3 > numero1 && numero1 > numero2){
            
            System.out.println("De mayor a menor: "+ numero3 + " - " + numero1 + " - " + numero2);

        }else if(numero3 > numero2 && numero2 > numero1){
            
            System.out.println("De mayor a menor: "+ numero3 + " - " + numero2 + " - " + numero1);
        
        }else{
            
            System.out.println("Hay 2 o 3 numeros iguales");
        
        }
        
    }
    
}
