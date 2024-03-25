package org.example.libreria.model;

public class GuiaTuristica extends Libros{


    private String ciudadGuia;

    public GuiaTuristica(String id, String nombre, String ciudadGuia) {
        super(id, nombre);
        this.ciudadGuia = ciudadGuia;
    }

    public String getCiudadGuia() {
        return ciudadGuia;
    }

    public void setCiudadGuia(String ciudadGuia) {
        this.ciudadGuia = ciudadGuia;
    }

    @Override
    public void imprimirLibro() {

    }
}
