package org.example.libreria.funcion;

import java.util.ArrayList;
import java.util.List;

public class FakeBD {

    private List<Imprimible> registros;

    public FakeBD() {
        this.registros = new ArrayList<>();
    }

    public void agregarRegistro(Imprimible registro) {
        registros.add(registro);
    }

    public void imprimirRegistros() {
        for (Imprimible registro : registros) {
            registro.imprimirLibro();
            System.out.println();
        }
    }
}
