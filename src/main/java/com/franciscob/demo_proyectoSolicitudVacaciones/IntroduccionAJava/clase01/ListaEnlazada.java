package com.franciscob.demo_proyectoSolicitudVacaciones.IntroduccionAJava.clase01;

import java.util.LinkedList;

public class ListaEnlazada {

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("cars = " + cars);
    }
}
