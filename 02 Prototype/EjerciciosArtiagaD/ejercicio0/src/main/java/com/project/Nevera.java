package com.project;

public class Nevera extends Electrodomestic {
    private int frigories;
    private int soroll;

    public Nevera(String nom, String color, double preu, String marca, String eficiencia, int frigories, int soroll) {
        super(nom, color, preu, marca, eficiencia);
        this.frigories = frigories;
        this.soroll = soroll;
    }

    @Override
    public Nevera clone() {
        return new Nevera(getNom(), getColor(), getPreu(), getMarca(), getEficiencia(), frigories, soroll);
    }

    @Override
    public String toString() {
        return super.toString() + " Nevera{" + "frigories=" + frigories + ", soroll=" + soroll + '}';
    }
}
