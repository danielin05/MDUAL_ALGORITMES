package com.project;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Magatzem {
    private List<Producte> productes;
    private int capacitat;
    private PropertyChangeSupport support;

    public Magatzem() {
        this.productes = new ArrayList<>();
        this.capacitat = 10;
        this.support = new PropertyChangeSupport(this);
    }

    public List<Producte> getProductes() {
        return productes;
    }

    public void addProducte(Producte producte) {
        if (productes.size() < capacitat) {
            productes.add(producte);
            support.firePropertyChange("magatzemAdd", null, producte.getId());
            capacitat--;
            System.out.println("S'ha afegit el producte amb id " + producte.getId() + " al magatzem, capacitat: " + capacitat);
        } else {
            System.out.println("El magatzem està ple.");
        }
    }

    public void removeProducte(int id) {
        Producte producteToRemove = null;
        for (Producte p : productes) {
            if (p.getId() == id) {
                producteToRemove = p;
                break;
            }
        }
        if (producteToRemove != null) {
            productes.remove(producteToRemove);
            support.firePropertyChange("magatzemRemove", producteToRemove.getId(), null);
            capacitat++;
            System.out.println("S'ha esborrat el producte amb id " + id + " del magatzem, capacitat: " + capacitat);
        }
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    @Override
    public String toString() {
        return "Magatzem: {" + "productes = " + productes + ", capacitat=" + capacitat + '}';
    }
}