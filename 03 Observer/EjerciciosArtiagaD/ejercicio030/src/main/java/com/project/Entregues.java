package com.project;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Entregues {
    private List<Producte> productes;
    private PropertyChangeSupport support;

    public Entregues() {
        this.productes = new ArrayList<>();
        this.support = new PropertyChangeSupport(this);
    }

    public List<Producte> getProductes() {
        return productes;
    }

    public void addProducte(Producte producte) {
        productes.add(producte);
        support.firePropertyChange("entreguesAdd", null, producte.getId());
        System.out.println("S'ha afegit el producte amb id " + producte.getId() + " a la llista d'entregues.");
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
            support.firePropertyChange("entreguesRemove", producteToRemove.getId(), null);
            System.out.println("S'ha entregat el producte amb id " + id);
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
        return "Entregues{" +
                "productes=" + productes +
                '}';
    }
}