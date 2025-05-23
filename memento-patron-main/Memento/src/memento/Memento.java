/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package memento;

/**
 *
 * @author Estudiantes
 */
public class Memento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Historial historial = new Historial();

        editor.escribir("Hola ");
        historial.guardar(editor.guardar());

        editor.escribir("mundo!");
        historial.guardar(editor.guardar());

        System.out.println("Texto actual: " + editor.getTexto());

        editor.restaurar(historial.deshacer());
        System.out.println("Después de deshacer: " + editor.getTexto());

        editor.restaurar(historial.deshacer());
        System.out.println("Después de deshacer otra vez: " + editor.getTexto());
    }
    
}
