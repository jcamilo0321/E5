package Personas;

/**
* Clase que modela una persona con atributos como nombre, apellidos,
* teléfono y dirección.
* @version 1.2/2020
*/
public class Persona {
    String nombre;     // Nombre de la persona
    String apellidos;  // Apellidos de la persona
    String telefono;   // Número de teléfono de la persona
    String direccion;  // Dirección de la persona

    /**
    * Constructor de la clase Persona.
    * @param nombre Nombre de la persona.
    * @param apellidos Apellidos de la persona.
    * @param telefono Número de teléfono de la persona.
    * @param dirección Dirección de la persona.
    */
    public Persona(String nombre, String apellidos, String telefono, String dirección) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = dirección;
    }
}
