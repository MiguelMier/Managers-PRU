package org.example.cafetera.model;

import org.example.cafetera.model.extension.CafeteraExpresso;
import org.example.cafetera.model.extension.CafeteraMolinillo;
import org.example.cafetera.model.extension.CafeteraRistretto;
import org.example.cafetera.model.extension.liskov.Cafe;
import org.example.cafetera.model.extension.liskov.CafeteraFiltro;

import java.util.Scanner;

public class ControllerCafetera {

    public void startCafetera(){
        Cafetera cafetera;

        cafetera = new CafeteraExpresso(1000, 500);
        prepararYMostrarCafe(cafetera);

        cafetera = new CafeteraMolinillo(1500, 700);
        prepararYMostrarCafe(cafetera);

        cafetera = new CafeteraRistretto(1200, 800);
        prepararYMostrarCafe(cafetera);

        cafetera = new CafeteraFiltro(2000, 1500);
        prepararYMostrarCafe(cafetera);
    }

    public void run() {
        Cafetera cafetera;
        Scanner scanner = new Scanner(System.in);
        cafetera = new CafeteraExpresso(1000, 500);

        // Interacción con el usuario
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    prepararYMostrarCafe(cafetera, new CafeteraExpresso(1000, 500));
                    break;
                case 2:
                    prepararYMostrarCafe(cafetera, new CafeteraMolinillo(1500, 700));
                    break;
                case 3:
                    prepararYMostrarCafe(cafetera, new CafeteraRistretto(1200, 800));
                    break;
                case 4:
                    prepararYMostrarCafe(cafetera, new CafeteraFiltro(2000, 1500));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("Bienvenido a la Cafetera");
        System.out.println("Seleccione el tipo de café que desea preparar:");
        System.out.println("1. Espresso");
        System.out.println("2. Café con molinillo");
        System.out.println("3. Ristretto");
        System.out.println("4. Café con filtro");
        System.out.println("5. Salir");
        System.out.print("Ingrese su opción: ");
    }


    public void prepararYMostrarCafe(Cafetera cafetera) {
        Cafe cafe = cafetera.preparar();
        if (cafe != null) {
            System.out.println("Se ha preparado un " + cafe.getTipo());
            System.out.println("Cantidad de café restante en la cafetera: " + cafetera.nivelAgua + " ml");
        }
    }

    public void prepararYMostrarCafe(Cafetera cafetera, Cafetera nuevaCafetera) {
        Cafe cafe = nuevaCafetera.preparar();
        if (cafe != null) {
            System.out.println("Se ha preparado un " + cafe.getTipo());
            System.out.println("Cantidad de café restante en la cafetera: " + cafetera.nivelAgua + "ml");
        }
    }
}
