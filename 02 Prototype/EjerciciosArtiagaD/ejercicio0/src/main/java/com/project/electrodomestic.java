package main.java.com.project;

import com.project.Poligon;

public abstract class electrodomestic {
    
    private String nom;
    private String color;
    private String marca;
    private String eficiencia;
    private float preu;

    public electrodomestic(){}

    public electrodomestic(electrodomestic target) {
        if (target != null){
            this.nom = target.nom;
            this.color = target.color;
            this.marca = target.marca;
            this.eficiencia = target.eficiencia;
            this.preu = target.preu;
        }
    }
    public abstract electrodomestic clone();
}
