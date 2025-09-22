package com.franciscob.demo_proyectoSolicitudVacaciones.IntroduccionAJava;

import java.util.HashSet;

public class JavaSetClass {
    public static void main(String[] args) {


        HashSet<String> cars = new HashSet<String>();

        //agregar elemetnos
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");

        System.out.println("cars = " + cars);

        //si existe el elemento
        System.out.println(cars.contains("Mazda"));
        for(String i : cars){
            System.out.println("la marca del automovil : = " + i);
        }
    }
}
