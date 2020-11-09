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
public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        double numero1, numero2, resultado;
        int opcion;
        
        System.out.println("-----OPERACIONES BASICAS-----");
        System.out.println("1- SUMAR");
        System.out.println("2- RESTAR");
        System.out.println("3- MULTIPLICAR");
        System.out.println("4- DIVIDIR");
        System.out.println("5- POTENCIA");

        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese una Opcion");
        opcion = escaner.nextInt();
        
        System.out.println("Ingrese un numero");
        numero1 = escaner.nextDouble();
        
        System.out.println("Ingrese un numero");
        numero2 = escaner.nextDouble();
        
        switch(opcion){
        
            case 1:
                 
                resultado = numero1 + numero2;
                
                System.out.println("El numero: " + numero1);
                System.out.println("El numero: " + numero2);
                System.out.println("El resultado: " + resultado);
                
                break;
            case 2:
                 
                resultado = numero1 + numero2;
                
                System.out.println("El numero: " + numero1);
                System.out.println("El numero: " + numero2);
                System.out.println("El resultado: " + resultado);
                
                break;
            case 3:
                 
                resultado = numero1 + numero2;
                
                System.out.println("El numero: " + numero1);
                System.out.println("El numero: " + numero2);
                System.out.println("El resultado: " + resultado);
                
                break;
                
            case 4:
                 
                resultado = numero1 - numero2;
                
                System.out.println("El numero: " + numero1);
                System.out.println("El numero: " + numero2);
                System.out.println("El resultado: " + resultado);
                
                break;
            case 5:
                 
                resultado = numero1 * numero2;
                
                System.out.println("El numero: " + numero1);
                System.out.println("El numero: " + numero2);
                System.out.println("El resultado: " + resultado);
                
                break;
                
            case 6:
                 
                resultado = numero1 / numero2;
                
                System.out.println("El numero: " + numero1);
                System.out.println("El numero: " + numero2);
                System.out.println("El resultado: " + resultado);
                
                break;
            
            case 7:
                 
                resultado = Math.pow(numero1, numero2);
                
                System.out.println("El numero: " + numero1);
                System.out.println("El numero: " + numero2);
                System.out.println("El resultado: " + resultado);
                
                break;
                
            default:
                
                System.out.println("No existe esa opcion");
                
                break;

        }
         
    }
    
}
