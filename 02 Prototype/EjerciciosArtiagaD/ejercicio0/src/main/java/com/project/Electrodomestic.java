package com.project;

public abstract class Electrodomestic {
    private String nom;
    private String color;
    private double preu;
    private String marca;
    private String eficiencia;

    public Electrodomestic(String nom, String color, double preu, String marca, String eficiencia) {
        this.nom = nom;
        this.color = color;
        this.preu = preu;
        this.marca = marca;
        this.eficiencia = eficiencia;
    }


    public abstract Electrodomestic clone();

    @Override
    public String toString() {
        return "Electrodomèstic{" + "nom='" + nom + '\'' + ", color='" + color + '\'' + ", preu=" + preu + ", marca='" + marca + '\'' + ", eficiencia='" + eficiencia + '\'' + '}';
    }


    public String getNom() {
        return nom;
    }
    public String getColor() {
        return color;
    }
    public double getPreu() {
        return preu;
    }
    public String getMarca() {
        return marca;
    }
    public String getEficiencia() {
        return eficiencia;
    }

}


