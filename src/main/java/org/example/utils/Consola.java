package org.example.utils;

import org.example.model.employee.Client;
import org.example.model.employee.Employee;
import org.example.model.employee.Manager;
import org.example.model.interfaces.Personal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consola {

    private List<Personal> personas;

    public Consola(){
        this.personas = new ArrayList<Personal>();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Introducir Manager");
            System.out.println("2. Introducir Empleado");
            System.out.println("3. Introducir Cliente");
            System.out.println("4. Imprimir Personal");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresando información de un Manager:");
                    ingresarManager(scanner);
                    break;
                case 2:
                    System.out.println("Ingresando información de un Empleado:");
                    ingresarEmpleado(scanner);
                    break;
                case 3:
                    System.out.println("Ingresando información de un Cliente:");
                    ingresarCliente(scanner);
                    break;
                case 4:
                    System.out.println("Imprimiendo Personal:");
                    printPersonal();
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 5.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private void ingresarManager(Scanner scanner) {
        System.out.print("Ingrese el id del Manager: ");
        String id = scanner.nextLine();
        System.out.print("Ingrese el nombre del Manager: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la oficina del Manager: ");
        String oficina = scanner.nextLine();

        Manager manager = new Manager(nombre, id, oficina);
        manager.guardarBD();
        personas.add(manager);

    }

    private void ingresarEmpleado(Scanner scanner) {
        System.out.print("Ingrese el id del Empleado: ");
        String id = scanner.nextLine();
        System.out.print("Ingrese el nombre del Empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el puesto del Empleado: ");
        String puesto = scanner.nextLine();
        System.out.print("Ingrese la oficina del Empleado: ");
        String oficina = scanner.nextLine();

        Employee employee = new Employee(nombre,id, puesto, oficina);
        employee.guardarBD();
        personas.add(employee);
    }

    private void ingresarCliente(Scanner scanner) {
        System.out.print("Ingrese el nombre del Cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el id de Cliente: ");
        String id = scanner.nextLine();
        System.out.print("Ingrese el nombre del pedido de Cliente: ");
        String pedido = scanner.nextLine();

        Client client = new Client(nombre,id, pedido);
        client.guardarBD();
        personas.add(client);
    }

    private void printPersonal(){
        for(Personal p:personas){
            p.printInfo();
        }
    }

}
