package Personas;

public class Principal {
    /**
     * Método principal que sirve como punto de entrada al programa.
     * Crea una instancia de la clase VentanaPrincipal y la hace visible.
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Crear una instancia de VentanaPrincipal
        VentanaPrincipal miVentanaPrincipal;
        miVentanaPrincipal = new VentanaPrincipal();
        
        // Hacer visible la ventana principal
        miVentanaPrincipal.setVisible(true);
    }
}
