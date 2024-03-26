package org.example.cafetera.model;

import org.example.cafetera.model.extension.CafeFunc;
import org.example.cafetera.model.extension.inversion.Molienda;
import org.example.cafetera.model.extension.liskov.Cafe;

public abstract class Cafetera implements CafeFunc {

    protected double capacidadTotal;
    protected double nivelAgua;
    protected Molienda molienda;

    public Cafetera(double capacidadTotal, double nivelAgua, Molienda molienda) {
        this.capacidadTotal = capacidadTotal;
        this.nivelAgua = nivelAgua;
        this.molienda = molienda;
    }


    public double getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(double nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public Molienda getMolienda() {
        return molienda;
    }

    public void setMolienda(Molienda molienda) {
        this.molienda = molienda;
    }
}
