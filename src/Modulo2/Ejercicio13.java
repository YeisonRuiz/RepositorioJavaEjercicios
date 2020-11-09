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
public class Ejercicio13 {
    
    public static void main(String[] args) {
        
           
        String user = "admin";
        String pass = "123";
        int dd;
        
        String usuario, contrasena,dds;
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese usuario");
        usuario = escaner.nextLine();
        
        System.out.println("Ingrese clave");
        contrasena = escaner.nextLine();
        
        if (usuario.equals(user) && contrasena.equals(pass)) {
            
            System.out.println("Bienvenido al Sistema");
            
        } else {
            
            System.out.println("Error! Usuario o Clave son incorrectas");

        }
        
        
        
    }
    
}
