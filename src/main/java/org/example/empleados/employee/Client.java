package org.example.empleados.employee;

import org.example.empleados.interfaces.Personal;

public class Client extends Personal {

    private String pedido;
    public Client(String nombre, String id, String pedido) {
        super(nombre, id);
        this.pedido = pedido;
    }

    public void guardarBD() {
        System.out.println("Cliente guardado con éxito!");
    }


    public void printInfo() {
        System.out.println(" --> Cliente: " + getNombre() + " con pedido: " + getPedido());
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
}
