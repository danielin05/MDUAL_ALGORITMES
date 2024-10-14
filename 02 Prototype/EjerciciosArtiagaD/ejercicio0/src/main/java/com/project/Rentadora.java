package com.project;

public class Rentadora extends Electrodomestic{
    private int revolucions;
    private int soroll;

    public Rentadora(String nom, String color, double preu, String marca, String eficiencia, int revolucions, int soroll) {
        super(nom, color, preu, marca, eficiencia);
        this.revolucions = revolucions;
        this.soroll = soroll;
    }

    @Override
    public Rentadora clone() {
        return new Rentadora(getNom(), getColor(), getPreu(), getMarca(), getEficiencia(), revolucions, soroll);
    }

    @Override
    public String toString() {
        return super.toString() + " Rentadora{" + "revolucions=" + revolucions + ", soroll=" + soroll + '}';
    }
}
