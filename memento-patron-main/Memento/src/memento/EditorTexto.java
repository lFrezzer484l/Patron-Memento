/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

/**
 *
 * @author Estudiantes
 */
public class EditorTexto {
    private String texto = "";

    public void escribir(String nuevoTexto) {
        texto += nuevoTexto;
    }

    public String getTexto() {
        return texto;
    }

    public TextoMemento guardar() {
        return new TextoMemento(texto);
    }

    public void restaurar(TextoMemento memento) {
        texto = memento.getEstado();
    }
}
