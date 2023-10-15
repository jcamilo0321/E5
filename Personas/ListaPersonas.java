package Personas;
import java.util.*;

public class ListaPersonas {
    Vector listaPersonas; // Vector que almacena objetos de la clase Persona

    // Constructor de la clase ListaPersonas
    public ListaPersonas() {
        listaPersonas = new Vector(); // Inicializa el vector de personas
    }

    // Método para agregar una persona al vector
    public void añadirPersona(Persona p) {
        listaPersonas.add(p); // Agrega una instancia de Persona al vector
    }

    // Método para eliminar una persona del vector
    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i); // Elimina una persona en la posición i del vector
    }

    // Método para eliminar todas las personas del vector
    public void borrarLista() {
        listaPersonas.removeAllElements(); // Elimina todas las personas del vector
    }
}
