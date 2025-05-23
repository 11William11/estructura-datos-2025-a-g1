package hotel;

// Clase que representa a un cliente del hotel
public class Cliente {
    // Atributos privados del cliente
    private String nombre;
    private int id;

    // Constructor que inicializa un cliente
    public Cliente(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Métodos getter para acceder a los datos del cliente
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    // Método para mostrar la información del cliente
    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + " (ID: " + id + ")");
    }
}
