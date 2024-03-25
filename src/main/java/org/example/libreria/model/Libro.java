package org.example.libreria.model;

public class Libro extends Libros{

    private String genero;


    public Libro(String id, String nombre,String genero) {
        super(id, nombre);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void imprimirLibro() {

    }
}
