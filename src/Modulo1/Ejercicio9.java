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
public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        String vendedor;
        int salario = 1000;
        int cantidad_carro_vendido;
        double venta_carro;
        double comision;
        double salario_mensual;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Cantidad de carros vendidos");
        cantidad_carro_vendido = escaner.nextInt();
        
        System.out.println("Costo de la venta del carro?");
        venta_carro = escaner.nextDouble();
        
        
        comision = cantidad_carro_vendido * 150 + venta_carro * 0.05;
        
        salario_mensual = salario + comision;
        
        
        System.out.println("El salario mensual del trabajor es: " + salario_mensual);
        
        
        
    }
    
}
