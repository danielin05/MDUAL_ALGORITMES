package com.project;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class Magatzem {
    private ArrayList<Producte> productes;

    private int capacitat = 10;

    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public Magatzem(ArrayList<Producte> productes, int capacitat) {
        this.productes = productes;
        this.capacitat = capacitat;
    }

    public ArrayList<Producte> getProductes() {
        return productes;
    }

    public void setProductes(ArrayList<Producte> productes) {
        ArrayList<Producte> oldProductes = this.productes;
        this.productes = productes;
        support.firePropertyChange("productes", oldProductes, productes);
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        int oldCapacitat = this.capacitat;
        this.capacitat = capacitat;
        support.firePropertyChange("capacitat", oldCapacitat, capacitat);
    }

        public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
