package org.example.cafetera.model.extension;

import org.example.cafetera.model.Cafetera;
import org.example.cafetera.model.extension.inversion.Molienda;
import org.example.cafetera.model.extension.liskov.Cafe;

public class CafeteraMolinillo extends Cafetera {

    private static final double CONSUMO_AGUA_MOLINILLO = 50; // en mililitros

    public CafeteraMolinillo(double capacidadTotal, double nivelAgua, Molienda molienda) {
        super(capacidadTotal, nivelAgua, molienda);
    }

    @Override
    public Cafe preparar() {
        System.out.println("Preparando café con molinillo...");
        if (nivelAgua >= CONSUMO_AGUA_MOLINILLO) {
            setNivelAgua(nivelAgua - CONSUMO_AGUA_MOLINILLO);
            return new Cafe("Café con molinillo", CONSUMO_AGUA_MOLINILLO);
        } else {
            System.out.println("No hay suficiente agua en la cafetera para preparar café con molinillo.");
            return null;
        }
    }
}
