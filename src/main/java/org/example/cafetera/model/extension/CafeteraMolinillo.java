package org.example.cafetera.model.extension;

import org.example.cafetera.model.Cafetera;

public class CafeteraMolinillo extends Cafetera {

    public CafeteraMolinillo(){
        setMlCafe(50);
    }

    public void hacerCafe(){
        if(getNumCafesDisponibles() > 2){
            calentarCafetera();
            setNumCafesDisponibles(super.getNumCafesDisponibles() - 2);}
        else
            rellenarCafe();
    }
}
