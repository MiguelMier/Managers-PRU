package org.example.cafetera.model.extension.liskov;

import org.example.cafetera.model.Cafetera;
import org.example.cafetera.model.extension.inversion.Molienda;

public class CafeteraFiltro extends Cafetera {
    private static final double CONSUMO_AGUA_FILTRO = 100;

    public CafeteraFiltro(double capacidadTotal, double nivelAgua, Molienda molienda) {
        super(capacidadTotal, nivelAgua, molienda);
    }

    @Override
    public Cafe preparar() {
        System.out.println("Preparando café con filtro...");
        if (nivelAgua >= CONSUMO_AGUA_FILTRO) {
            setNivelAgua(nivelAgua - CONSUMO_AGUA_FILTRO);
            return new Cafe("Café con filtro", CONSUMO_AGUA_FILTRO);
        } else {
            System.out.println("No hay suficiente agua en la cafetera para preparar café con filtro.");
            return null;
        }
    }
}
