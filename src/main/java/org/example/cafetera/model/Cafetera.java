package org.example.cafetera.model;

import org.example.cafetera.model.extension.CafeFunc;
import org.example.cafetera.model.extension.liskov.Cafe;

public abstract class Cafetera  {

    protected double capacidadTotal; // en mililitros
    protected double nivelAgua; // en mililitros

    public Cafetera(double capacidadTotal, double nivelAgua) {
        this.capacidadTotal = capacidadTotal;
        this.nivelAgua = nivelAgua;
    }

    public abstract Cafe preparar();
}
