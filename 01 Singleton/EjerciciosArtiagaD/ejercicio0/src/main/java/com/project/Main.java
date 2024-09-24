package com.project;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(".. .iniciant 1 ...");

            Thread.sleep(3000);

            Object instance1 = Object.getInstance("Daniel", "Artiaga", 19);
            System.out.println(instance1.toString());

            System.out.println(".. .iniciant 2 ...");
            
            Thread.sleep(3000);
            
            Object instance2 = Object.getInstance("Pedro", "Manolito", 76);
            System.out.println(instance2.toString());

            System.out.println(".. .iniciant 3 ...");
            
            Thread.sleep(3000);
            
            Object instance3 = Object.getInstance("Antonio", "Perez", 23);
            System.out.println(instance3.toString());
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
