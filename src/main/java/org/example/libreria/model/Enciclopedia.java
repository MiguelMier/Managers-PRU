package org.example.libreria.model;

public class Enciclopedia extends Libros{

    private String categoria;
    public Enciclopedia(String id, String nombre, String categoria) {
        super(id, nombre);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void imprimirLibro() {

    }
}
