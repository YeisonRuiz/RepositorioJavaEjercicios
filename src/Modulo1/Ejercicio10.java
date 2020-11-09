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
public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        String nombre;
        int horasNormales, horasExtras;
        double salario, costoHora, costoHoraExtra;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del trabajador?");
        nombre = escaner.nextLine();
        
        System.out.println("Costo de Hora");
        costoHora = escaner.nextDouble();
        
        System.out.println("Ingrese Horas Normales");
        horasNormales = escaner.nextInt();
        
        System.out.println("Ingrese Horas Extras");
        horasExtras = escaner.nextInt();
        
        costoHoraExtra = costoHora + (costoHora * 0.35);
        
        salario = (costoHora * horasNormales) + (costoHoraExtra * horasExtras);
        
        System.out.println("El costo de hora es: " + costoHora);
        System.out.println("Las horas normales trabajadas: " + horasNormales);
        System.out.println("Las horas extras trabajadas: " + horasExtras);
        
        System.out.println("--------------");
        
        System.out.println("El empleado: " + nombre);
        System.out.println("Su salario es: " + salario);
        
        
        
        
    }
    
}
