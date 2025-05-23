package hotel;

// Clase que representa una habitación de hotel
public class Habitacion {
    // Atributos privados (encapsulamiento)
    private int numero;
    private String tipo;
    private boolean ocupada;

    // Constructor para inicializar una habitación
    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.ocupada = false; // Por defecto, la habitación está libre
    }

    // Métodos getter (lectura de atributos privados)
    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    // Metodo para marcar la habitación como ocupada
    public void ocupar() {
        ocupada = true;
    }

    // Metodo para liberar la habitación
    public void liberar() {
        ocupada = false;
    }

    // Metodo para mostrar información de la habitación
    public void mostrarInfo() {
        System.out.println("Habitación " + numero + " (" + tipo + ") - " +
                (ocupada ? "Ocupada" : "Disponible"));
    }
}

