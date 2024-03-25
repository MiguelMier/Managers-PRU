package org.example.cafetera.model;

public class Cafetera {

    private boolean tieneCafe;
    private int numCafesDisponibles;

    public Cafetera(){
        this.tieneCafe = false;
        this.numCafesDisponibles = 0;
    }

    public void rellenarCafe(){
        this.tieneCafe = true;
        this.numCafesDisponibles = 10;
    }

    public void seAcaboElCafe(){
        this.tieneCafe = false;
    }

    public void hacerCafe(){
        if(numCafesDisponibles > 1){
            calentarCafetera();
            this.numCafesDisponibles--;}
        else
            rellenarCafe();
    }

    public void calentarCafetera(){
        System.out.println("Calentando cafetera...");
    }

}
