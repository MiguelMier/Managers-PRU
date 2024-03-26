package org.example.cafetera.model.extension;

import org.example.cafetera.model.Cafetera;
import org.example.cafetera.model.extension.inversion.Molienda;
import org.example.cafetera.model.extension.liskov.Cafe;

public class CafeteraExpresso extends Cafetera {

    private static final double CONSUMO_AGUA_ESPRESSO = 30; // en mililitros

    public CafeteraExpresso(double capacidadTotal, double nivelAgua, Molienda molienda) {
        super(capacidadTotal, nivelAgua, molienda);
    }

    @Override
    public Cafe preparar() {
        System.out.println("Preparando espresso...");
        if (nivelAgua >= CONSUMO_AGUA_ESPRESSO) {
            setNivelAgua(nivelAgua - CONSUMO_AGUA_ESPRESSO);
            return new Cafe("Espresso", CONSUMO_AGUA_ESPRESSO);
        } else {
            System.out.println("No hay suficiente agua en la cafetera para preparar espresso.");
            return null;
        }
    }
}
