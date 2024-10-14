package com.project;

public class Main {
    public static void main(String[] args) {

        Producte p0 = new Producte(0, "Llibre");
        Producte p1 = new Producte(1, "Boli");
        Producte p2 = new Producte(2, "Rotulador");
        Producte p3 = new Producte(3, "Carpeta");
        Producte p4 = new Producte(4, "Motxilla");

        Magatzem magatzem = new Magatzem();
        Entregues entregues = new Entregues();

        // PropertyChangeListeners
        p0.addPropertyChangeListener(x -> {
            if ("producteId".equals(x.getPropertyName())) {
                System.out.println("Producte ha canviat l'id de '" + x.getOldValue() + "' a '" + x.getNewValue() + "'");
            } else if ("producteName".equals(x.getPropertyName())) {
                System.out.println("Producte ha canviat el nom de '" + x.getOldValue() + "' a '" + x.getNewValue() + "'");
            }
        });

        magatzem.addPropertyChangeListener(x -> {
            if ("magatzemAdd".equals(x.getPropertyName())) {
                System.out.println("S'ha afegit el producte amb id " + x.getNewValue() + " al magatzem.");
            } else if ("magatzemRemove".equals(x.getPropertyName())) {
                entregues.addProducte(p0);
                System.out.println("S'ha mogut el producte amb id " + x.getOldValue() + " del magatzem cap a les entregues.");
            }
        });

        entregues.addPropertyChangeListener(x -> {
            if ("entreguesAdd".equals(x.getPropertyName())) {
                System.out.println("S'ha afegit el producte amb id " + x.getNewValue() + " a les entregues.");
            } else if ("entreguesRemove".equals(x.getPropertyName())) {
                System.out.println("S'ha entregat el producte amb id " + x.getOldValue() + ".");
            }
        });

        // Test de funcionalitat
        p0.setId(5);
        p0.setNom("Llibreta");
        p1.setNom("Boli");

        magatzem.addProducte(p0);
        magatzem.addProducte(p1);
        magatzem.addProducte(p2);
        magatzem.addProducte(p3);
        magatzem.addProducte(p4);

        magatzem.removeProducte(2);
        magatzem.removeProducte(3);
        magatzem.removeProducte(4);

        entregues.removeProducte(2);
        entregues.removeProducte(3);

        System.out.println(magatzem);
        System.out.println(entregues);
    }
}