package org.example.cafetera.model.extension;

import org.example.cafetera.model.Cafetera;

public class CafeteraRistretto extends Cafetera {

    public CafeteraRistretto(){
        setMlCafe(10);
    }

    public void hacerCafe(){
        if(getNumCafesDisponibles() > 1){
            setNumCafesDisponibles(super.getNumCafesDisponibles() - 1);}
        else
            rellenarCafe();
    }
}
