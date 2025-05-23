/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;
import java.util.Stack;

/**
 *
 * @author Estudiantes
 */
public class Historial {
     private Stack<TextoMemento> historial = new Stack<>();

    public void guardar(TextoMemento memento) {
        historial.push(memento);
    }

    public TextoMemento deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
}
