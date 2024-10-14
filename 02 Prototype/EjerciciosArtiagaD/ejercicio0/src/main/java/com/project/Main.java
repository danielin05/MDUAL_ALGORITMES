package com.project;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Electrodomestic> electrodomestics = new ArrayList<>();

        // Afegir rentadores
        electrodomestics.add(new Rentadora("Rentadora LG", "Blanc", 450.99, "LG", "A++", 1200, 50));
        electrodomestics.add(new Rentadora("Rentadora Samsung", "Gris", 499.99, "Samsung", "A+", 1400, 48));

        // Afegir neveres
        electrodomestics.add(new Nevera("Nevera Whirlpool", "Blanc", 799.99, "Whirlpool", "A++", 300, 40));
        electrodomestics.add(new Nevera("Nevera Bosch", "Negre", 899.99, "Bosch", "A+", 350, 38));

        // Afegir forns
        electrodomestics.add(new Forn("Forn Siemens", "Inoxidable", 599.99, "Siemens", "A++", 250, true));
        electrodomestics.add(new Forn("Forn Balay", "Negre", 499.99, "Balay", "A", 230, false));

        // Crear llista de clones
        List<Electrodomestic> electrodomesticsClonats = new ArrayList<>();
        for (Electrodomestic e : electrodomestics) {
            electrodomesticsClonats.add(e.clone());
        }
        
        // Comparació de la llista original amb ella mateixa
        System.out.println("Comparant la llista original amb ella mateixa:");
        for (int i = 0; i < electrodomestics.size(); i++) {
            Electrodomestic original = electrodomestics.get(i);
            System.out.println("Mateix objecte: " + (original == original));
            System.out.println("Mateixa classe: " + (original.getClass() == original.getClass()));
            System.out.println("Mateixes dades: " + original.toString().equals(original.toString()));
        }

        // Comparació de la llista original amb els seus clones
        System.out.println("\nComparant la llista original amb els seus clones:");
        for (int i = 0; i < electrodomestics.size(); i++) {
            Electrodomestic original = electrodomestics.get(i);
            Electrodomestic clon = electrodomesticsClonats.get(i);
            System.out.println("Mateix objecte: " + (original == clon));
            System.out.println("Mateixa classe: " + (original.getClass() == clon.getClass()));
            System.out.println("Mateixes dades: " + original.toString().equals(clon.toString()));
        }
    }
}
