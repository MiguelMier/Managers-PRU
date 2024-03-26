package org.example.cafetera.model.extension.inversion;

public class MoliendaMuelaConica implements Molienda{
    @Override
    public String moler() {
        return "Moliendo con muelas cónicas...";
    }
}
