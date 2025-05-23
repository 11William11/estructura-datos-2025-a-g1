package hotel;
import java.util.Scanner;


// Clase principal que contiene el metodo
public class HotelApp {
    public static void main(String[] args) {
        // Crear un arreglo de habitaciones (3 habitaciones iniciales)
        Habitacion[] habitaciones = {
                new Habitacion(101, "Individual"),
                new Habitacion(102, "Doble"),
                new Habitacion(103, "Suite")
        };

        // Crear un cliente fijo (para ejemplo)
        Cliente cliente = new Cliente("Juan Pérez", 1234);

        // Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Menú interactivo con ciclo do-while
        do {
            System.out.println("\n--- Menú del Hotel ---");
            System.out.println("1. Ver habitaciones");
            System.out.println("2. Reservar habitación");
            System.out.println("3. Liberar habitación");
            System.out.println("4. Ver cliente");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            // Estructura switch para manejar las opciones del menú
            switch(opcion) {
                case 1:
                    // Mostrar todas las habitaciones
                    for (Habitacion h : habitaciones) {
                        h.mostrarInfo();
                    }
                    break;
                case 2:
                    // Reservar una habitación
                    System.out.print("Ingrese número de habitación a reservar: ");
                    int numReservar = scanner.nextInt();
                    reservarHabitacion(habitaciones, numReservar);
                    break;
                case 3:
                    // Liberar una habitación
                    System.out.print("Ingrese número de habitación a liberar: ");
                    int numLiberar = scanner.nextInt();
                    liberarHabitacion(habitaciones, numLiberar);
                    break;
                case 4:
                    // Mostrar información del cliente
                    cliente.mostrarInfo();
                    break;
                case 5:
                    // Salir del programa
                    System.out.println("¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while(opcion != 5); // Ciclo se repite mientras no se elija salir
    }

    // Metodo estático para reservar una habitación
    public static void reservarHabitacion(Habitacion[] habitaciones, int numero) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numero) {
                if (!h.isOcupada()) {
                    h.ocupar();
                    System.out.println("Habitación " + numero + " reservada con éxito.");
                } else {
                    System.out.println("La habitación ya está ocupada.");
                }
                return;
            }
        }
        System.out.println("Habitación no encontrada.");
    }

    // Metodo estático para liberar una habitación
    public static void liberarHabitacion(Habitacion[] habitaciones, int numero) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numero) {
                if (h.isOcupada()) {
                    h.liberar();
                    System.out.println("Habitación " + numero + " liberada con éxito.");
                } else {
                    System.out.println("La habitación ya estaba libre.");
                }
                return;
            }
        }
        System.out.println("Habitación no encontrada.");
    }
}

