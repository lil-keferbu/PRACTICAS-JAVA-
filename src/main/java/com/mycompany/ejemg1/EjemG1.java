package com.mycompany.ejemg1;

// Importar la clase JOptionPane para utilizar ventanas emergentes
import javax.swing.JOptionPane;

/**
 * Clase EjemG1: Ejemplo de uso de ventanas emergentes con JOptionPane.
 * Muestra diferentes tipos de mensajes utilizando ventanas emergentes.
 * @author Fernando Marinez Paxtian 
 */
public class EjemG1 {

    public static void main(String[] args) {
        
        // Mostrar un mensaje de información con un título y un ícono de información
        JOptionPane.showMessageDialog(null,"Ejemplo de Mensaje...", "Poner Titulo",
                                        JOptionPane.INFORMATION_MESSAGE, null);
    
        // Mostrar otro mensaje de información con un título diferente y el mismo ícono
        JOptionPane.showMessageDialog(null,"Mensaje de Informacion ...", "Titulo",
                                        JOptionPane.INFORMATION_MESSAGE, null);
    
        // Mostrar un mensaje de advertencia con un título y un ícono de advertencia
        JOptionPane.showMessageDialog(null,"Mensaje de advertencia..", "Titulo",
                                        JOptionPane.WARNING_MESSAGE);
        
        // Mostrar un mensaje de error con un título y un ícono de error
        JOptionPane.showMessageDialog(null,"Mensaje de Error..", "Titulo ERROR_MESSAGE",
                                        JOptionPane.ERROR_MESSAGE);
        
        // Mostrar un mensaje de pregunta con un título y un ícono de pregunta
        JOptionPane.showMessageDialog(null,"Mensaje de pregunta", "Titulo",
                                        JOptionPane.QUESTION_MESSAGE);
    }
}