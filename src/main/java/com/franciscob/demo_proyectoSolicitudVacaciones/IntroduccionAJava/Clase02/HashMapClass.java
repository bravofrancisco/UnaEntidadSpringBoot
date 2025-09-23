package com.franciscob.demo_proyectoSolicitudVacaciones.IntroduccionAJava.Clase02;

import java.util.HashMap;

public class HashMapClass {

    public static void main(String[] args) {
    HashMap<Integer, String> hash = new HashMap<>();
    hash.put(1000, "Juan");
    hash.put(3000, "ana");
    hash.put(2000, "Juanx");

        System.out.println("hash.get(1000) = " + hash.get(1000));
        hash.remove(3000);

        System.out.println("hash = " + hash);

        if(hash.containsKey(11500)){
            System.out.println(" tiene el valor de 1500");
            System.out.println("hash = " + hash.get(1500));
        }else{
            System.out.println("no lo tiene");
        }

        for (Integer i : hash.keySet()){
            System.out.println(hash.get(i));
        }
    }
}
