package com.project;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(".. .iniciant 1 ...");

            Thread.sleep(3000);

            System.out.println(".. .iniciant 2 ...");
            
            Thread.sleep(3000);

            System.out.println(".. .iniciant 3 ...");
            
            Thread.sleep(3000);

            Object instance1 = Object.getInstance("Daniel", "Artiaga", 19);
            System.out.println(instance1.toString());
            Object instance2 = getNewDestroyedInstance("Pedro", "Manolito", 76);
            System.out.println(instance2.toString());
            Object instance3 = getNewDestroyedInstance("Antonio", "Perez", 23);
            System.out.println(instance3.toString());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    
    static Object getNewDestroyedInstance (String nom, String cognom, int edat) {
        
        Object result = null;
        try {
            Constructor<?>[] constructors = Object.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                constructor.setAccessible(true);
                result = (Object) constructor.newInstance(nom, cognom, edat);
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }



    
}