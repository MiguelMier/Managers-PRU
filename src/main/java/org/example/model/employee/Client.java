package org.example.model.employee;

import java.util.*;

import org.example.model.interfaces.Personal;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

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
