/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo1;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        double horasSemanalesTrabajadas, salarioHoras, salarioSemanal;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese las horas trabajadas en la semana?");
        horasSemanalesTrabajadas = escaner.nextDouble();
        
        System.out.println("Costo por hora?");
        salarioHoras = escaner.nextDouble();
        
        salarioSemanal = horasSemanalesTrabajadas * salarioHoras;
        
        
        System.out.println("Salario del empleado es: " + salarioSemanal);
        
        
    }
    
}
