package org.example.cafetera.model.extension;

import org.example.cafetera.model.Cafetera;

public class CafeteraExpresso extends Cafetera {

    public CafeteraExpresso(){
        setMlCafe(25);
    }


    public void hacerCafe(){
        if(getNumCafesDisponibles() > 1){
            calentarCafetera();
            setNumCafesDisponibles(super.getNumCafesDisponibles() - 1);

        }
        else
            rellenarCafe();
    }
}
