package org.example.cafetera.model;

import org.example.cafetera.model.extension.CafeteraExpresso;
import org.example.cafetera.model.extension.CafeteraMolinillo;
import org.example.cafetera.model.extension.CafeteraRistretto;
import org.example.cafetera.model.extension.inversion.Molienda;
import org.example.cafetera.model.extension.inversion.MoliendaMuelaCircular;
import org.example.cafetera.model.extension.inversion.MoliendaMuelaConica;
import org.example.cafetera.model.extension.liskov.Cafe;
import org.example.cafetera.model.extension.liskov.CafeteraFiltro;

import java.util.Scanner;

public class ControllerCafetera {


    public void run() {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {

            Molienda molienda = seleccionMolienda();
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    prepararYMostrarCafe(new CafeteraExpresso(1000, 500, molienda));
                    break;
                case 2:
                    prepararYMostrarCafe(new CafeteraMolinillo(1500, 700, molienda));
                    break;
                case 3:
                    prepararYMostrarCafe(new CafeteraRistretto(1200, 800, molienda));
                    break;
                case 4:
                    prepararYMostrarCafe(new CafeteraFiltro(2000, 1500, molienda));
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

    private Molienda seleccionMolienda() {
        System.out.println("Seleccione el tipo de molienda:");
        System.out.println("1. Muelas cónicas");
        System.out.println("2. Muelas circulares");
        System.out.print("Ingrese su opción: ");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                return new MoliendaMuelaConica();
            case 2:
                return new MoliendaMuelaCircular();
            default:
                System.out.println("Opción no válida. Se utilizará molienda por defecto.");
                return null;
        }
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


    public void prepararYMostrarCafe(Cafetera nuevaCafetera) {
        Cafe cafe = nuevaCafetera.preparar();
        if (cafe != null) {
            nuevaCafetera.getMolienda().moler();
            System.out.println("Se ha preparado un " + cafe.getTipo());
            System.out.println("Cantidad de café restante en la cafetera: " + nuevaCafetera.getNivelAgua() + "ml");
        }
    }
}
