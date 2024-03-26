package org.example.cafetera.model.extension.liskov;

import org.example.cafetera.model.Cafetera;

public class CafeteraFiltro extends Cafetera {
    private static final double CONSUMO_AGUA_FILTRO = 100; // en mililitros

    public CafeteraFiltro(double capacidadTotal, double nivelAgua) {
        super(capacidadTotal, nivelAgua);
    }

    @Override
    public Cafe preparar() {
        System.out.println("Preparando café con filtro...");
        if (nivelAgua >= CONSUMO_AGUA_FILTRO) {
            nivelAgua -= CONSUMO_AGUA_FILTRO;
            return new Cafe("Café con filtro", CONSUMO_AGUA_FILTRO);
        } else {
            System.out.println("No hay suficiente agua en la cafetera para preparar café con filtro.");
            return null;
        }
    }
}
