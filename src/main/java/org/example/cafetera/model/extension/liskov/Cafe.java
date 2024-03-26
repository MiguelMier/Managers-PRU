package org.example.cafetera.model.extension.liskov;

public class Cafe {

    private String tipo;
    private double cantidad; // en mililitros

    public Cafe(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void agregarCantidad(double cantidad) {
        this.cantidad += cantidad;
    }

    public void servir(double cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
            System.out.println("Sirviendo " + cantidad + "ml de " + tipo);
        } else {
            System.out.println("No hay suficiente café en la taza.");
        }
    }
}
