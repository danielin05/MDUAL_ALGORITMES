package com.project;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class Entregues {
    private ArrayList<Producte> productes;

    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public Entregues(ArrayList<Producte> productes) {
        this.productes = productes;
    }

    public ArrayList<Producte> getProductes() {
        return productes;
    }

    public void setProductes(ArrayList<Producte> productes) {
        ArrayList<Producte> oldProductes = this.productes;
        this.productes = productes;
        support.firePropertyChange("productes", oldProductes, productes);
    }

        public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
