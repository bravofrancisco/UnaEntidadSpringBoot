package com.franciscob.demo_proyectoSolicitudVacaciones.IntroduccionAJava.clase01;

import java.util.ArrayList;
import java.util.Collections;

public class ListClass {
    public static void main(String[] args) {

        ArrayList<String>cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //agregar a la lista
        cars.add(0, "Pagani");


        //CAMBIAR UN ELEMENTO
        cars.set(0,"OPEL");
        System.out.println("cars = " + cars.size());


        //recorer un arrayList
        System.out.println("****recorrer arraylist*****");
        ArrayList<String> cars8 = new ArrayList<String>();
        cars8.add("Volvo");
        cars8.add("BMW");
        cars8.add("Ford");
        cars8.add("Mazda");
        Collections.sort(cars8);
        for (int i=0; i< cars8.size();i++){
            System.out.println(cars8.get(i));
        }


    }
}
