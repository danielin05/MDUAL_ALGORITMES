package com.project;

public final class Object {
    
    private static Object instance;
    private String nom;
    private String cognom;
    private int edat;

    private Object(String nom, String cognom, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public static Object getInstance(String nom, String cognom, int edat) {
        if (instance == null) {
            instance = new Object(nom, cognom, edat);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Nom: " + instance.nom + " Cognom: " + instance.cognom + " Edat: " + instance.edat;
    }
}