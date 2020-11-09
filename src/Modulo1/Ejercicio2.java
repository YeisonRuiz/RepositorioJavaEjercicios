
package Modulo1;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    
    public static void main(String[] args) {
            
        String nombre;
        
        nombre = JOptionPane.showInputDialog("Digite su nombre");
        
        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
        
    }
    
}
