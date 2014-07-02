/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio8;
import javax.swing.*;

/**
 *
 * @author Isaac
 */
public class Ejercicio8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador=0;
        String s = JOptionPane.showInputDialog("Ingrese una frase","Escribir la frase aquí");
        s=" "+s;
        int tamano= s.length();
        char[] cadena=s.toCharArray();
        

        for (int i = 0; i < tamano; i++) {
            if ((cadena[i]=='a')||cadena[i]=='A') {
                contador++;
                for (int j = i; j < tamano; j++) {
                    if (cadena[i]==' ') {
                        i=j;
                        j=tamano;
                    }
                }
            }
            
           
        }
        if (contador==0) {
                    JOptionPane.showMessageDialog(null, "No hay Palabras que contengas la letra 'a'","Lo sentimos",JOptionPane.ERROR_MESSAGE);
        }
        else{
        JOptionPane.showMessageDialog(null, "El número de palabras que contienen la letra a es : "+contador,"Gracias por usar este Sistema",JOptionPane.PLAIN_MESSAGE);
        }
    }
    
     
    
}
