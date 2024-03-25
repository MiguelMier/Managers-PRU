package org.example.libreria.model;

import org.example.libreria.funcion.Imprimible;

public abstract class Libros implements Imprimible {

    private String id;
    private String nombre;

    public Libros(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
