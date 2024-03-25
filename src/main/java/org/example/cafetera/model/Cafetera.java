package org.example.cafetera.model;

import org.example.cafetera.model.extension.CafeFunc;

public abstract class Cafetera implements CafeFunc {

    private boolean tieneCafe;
    private int numCafesDisponibles;
    private int mlCafe;

    public Cafetera(){
        this.tieneCafe = false;
        this.numCafesDisponibles = 0;
    }

    public void rellenarCafe(){
        setNumCafesDisponibles(10);
    }

    public void calentarCafetera(){
        System.out.println("Calentando cafetera...");
    }

    public boolean isTieneCafe() {
        return tieneCafe;
    }

    public void setTieneCafe(boolean tieneCafe) {
        this.tieneCafe = tieneCafe;
    }

    public int getNumCafesDisponibles() {
        return numCafesDisponibles;
    }

    public void setNumCafesDisponibles(int numCafesDisponibles) {
        this.numCafesDisponibles = numCafesDisponibles;
    }

    public int getMlCafe() {
        return mlCafe;
    }

    public void setMlCafe(int mlCafe) {
        this.mlCafe = mlCafe;
    }
}
