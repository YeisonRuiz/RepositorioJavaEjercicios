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
public class Ejercicio8 {
    
    public static void main(String[] args) {
        
         int numero;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1-7 para mostrar el dia?");
        numero = escaner.nextInt();
        
        switch(numero){
        
            case 1:
         
                System.out.println("El dia es Lunes");              
                break;
                
            case 2:
                System.out.println("El dia es Martes");              
                break;
                
            case 3:
                System.out.println("El dia es Miercoles");              
                break;
                
            case 4:
                System.out.println("El dia es Jueves");              
                break;
                
            case 5:
                System.out.println("El dia es Viernes");              
                break;
                
            case 6:
                System.out.println("El dia es Sabado");              
                break;
                
            case 7:
                System.out.println("El dia es Domingo");              
                break;
                
            default:
                System.out.println("El numero que usted indica no esta en el rango de dias");
                break;
        }
       
    }
    
}
