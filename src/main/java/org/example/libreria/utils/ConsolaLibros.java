package org.example.libreria.utils;

import java.util.Scanner;

public class ConsolaLibros {

    public void run(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Ingresar información de un Libro");
            System.out.println("2. Ingresar información de una Enciclopedia");
            System.out.println("3. Ingresar información de una Guía Turística");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.println("Ingresando información de un Libro:");
                    //ingresarLibro(scanner);
                    break;
                case 2:
                    System.out.println("Ingresando información de una Enciclopedia:");
                    //ingresarEnciclopedia(scanner);
                    break;
                case 3:
                    System.out.println("Ingresando información de una Guía Turística:");
                    //ingresarGuiaTuristica(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 4.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
