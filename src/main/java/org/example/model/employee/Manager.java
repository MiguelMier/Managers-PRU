package org.example.model.employee;

import org.example.model.interfaces.Personal;

public class Manager extends Personal {

    private String oficinaAsignada;

    public Manager(String nombre, String id, String oficinaAsignada) {
        super(nombre, id);
        this.oficinaAsignada = oficinaAsignada;
    }

    public void guardarBD() {
        System.out.println("Manager guardado con éxito!");
    }


    public void printInfo() {
        System.out.println(" --> Manager: " + getNombre() + " oficina: " + getOficinaAsignada());
    }

    public String getOficinaAsignada() {
        return oficinaAsignada;
    }

    public void setOficinaAsignada(String oficinaAsignada) {
        this.oficinaAsignada = oficinaAsignada;
    }
}
