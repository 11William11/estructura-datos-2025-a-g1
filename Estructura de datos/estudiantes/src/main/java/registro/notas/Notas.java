package registro.notas;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;  // Variable para controlar el menú
        int[] calificaciones = new int[0];  // Arreglo para almacenar calificaciones

        // Ciclo do-while para mostrar el menú principal hasta que el usuario decida salir
        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Ingresar calificaciones");
            System.out.println("2. Mostrar calificaciones ordenadas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Solicita al usuario cuántas calificaciones desea ingresar
                    System.out.print("¿Cuántas calificaciones desea ingresar? ");
                    int n = scanner.nextInt();
                    calificaciones = new int[n]; // Se crea el arreglo con el tamaño indicado

                    // Ciclo for para capturar cada calificación
                    for (int i = 0; i < n; i++) {
                        System.out.print("Ingrese calificación #" + (i + 1) + ": ");
                        calificaciones[i] = scanner.nextInt();
                    }
                    break;

                case 2:
                    // Verifica si ya se ingresaron calificaciones
                    if (calificaciones.length == 0) {
                        System.out.println("Debe ingresar calificaciones primero.");
                    } else {
                        // Ordena las calificaciones usando el metodo burbuha
                        burbuja(calificaciones);

                        // Muestra las calificaciones ordenadas
                        System.out.println("Calificaciones ordenadas:");
                        for (int i = 0; i < calificaciones.length; i++) {
                            System.out.println("[" + i + "]: " + calificaciones[i]);
                        }
                    }
                    break;

                case 3:
                    // Sale del programa
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    // Opción no válida
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 3);  // Condición para continuar en el menú

        scanner.close();
    }

    // Metodo que implementa el algoritmo de ordenamiento burbuja
    public static void burbuja(int[] arreglo) {
        int n = arreglo.length;

        // Ciclos anidados para comparar y ordenar elementos
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambia los elementos si están en orden incorrecto
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
}
