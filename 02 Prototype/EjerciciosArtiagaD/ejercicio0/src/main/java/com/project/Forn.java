package com.project;

public class Forn extends Electrodomestic{
    private int temperatura;
    private boolean autoneteja;

    public Forn(String nom, String color, double preu, String marca, String eficiencia, int temperatura, boolean autoneteja) {
        super(nom, color, preu, marca, eficiencia);
        this.temperatura = temperatura;
        this.autoneteja = autoneteja;
    }

    @Override
    public Forn clone() {
        return new Forn(getNom(), getColor(), getPreu(), getMarca(), getEficiencia(), temperatura, autoneteja);
    }

    @Override
    public String toString() {
        return super.toString() + " Forn{" + "temperatura=" + temperatura + ", autoneteja=" + autoneteja + '}';
    }
}
