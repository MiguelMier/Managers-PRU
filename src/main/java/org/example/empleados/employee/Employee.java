package org.example.empleados.employee;

import org.example.empleados.interfaces.Personal;

public class Employee extends Personal {

    private String puesto;
    private String oficinaAsignada;

    public Employee(String nombre, String id, String puesto, String oficinaAsignada) {
        super(nombre, id);
        this.puesto = puesto;
        this.oficinaAsignada = oficinaAsignada;
    }

    public void guardarBD() {
        System.out.println("Empleado guardado con éxito!");
    }



    public void printInfo() {
        System.out.println(" --> Empleado: " + getNombre() + " con puesto " + getPuesto());
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getOficinaAsignada() {
        return oficinaAsignada;
    }

    public void setOficinaAsignada(String oficinaAsignada) {
        this.oficinaAsignada = oficinaAsignada;
    }
}
