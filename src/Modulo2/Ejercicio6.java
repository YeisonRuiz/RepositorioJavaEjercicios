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
public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        String alumno;
        double desarrollo, diseno, modelamiento, promedio;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese nombre del estudiante?");
        alumno = escaner.nextLine();
        
        System.out.println("Ingrese la nota de Desarrollo Web?");
        desarrollo = escaner.nextInt();
        
        System.out.println("Ingrese la nota de Diseno Grafico?");
        diseno = escaner.nextInt();
        
        System.out.println("Ingrese la nota de Modelamiento de Base de Datos?");
        modelamiento = escaner.nextInt();
        
        promedio = (desarrollo + diseno + modelamiento) / 3;
        
        promedio = Math.round(promedio * 1000) / 1000;
        
        
        if (promedio >= 10.5) {
            
            System.out.println("El estudiante: " + alumno);
            System.out.println("Aprobo con nota: " + promedio);
            
        }else{
            System.out.println("El estudiante: " + alumno);
            System.out.println("Reprobo con nota: " + promedio);
        
        }
        
    }
    
}
