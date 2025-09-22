package com.franciscob.demo_proyectoSolicitudVacaciones.IntroduccionAJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListClass {

    public static void main(String[] args) {
        //ArrayList es una matriz redimensionable que puede crecer segun sea
        //necesario permite almacenar elementos y accedeer a ellos mediante indice
    ArrayList<String> cars = new ArrayList<>();
    cars.add("Volvo");
    cars.add("Bwn");
    cars.add("Ford");

    //OBTENER 
        Iterator<String> it = cars.iterator();
        
        //iterate
        while (it.hasNext()){
            System.out.println("it.next() = " + it.next());
        }
    
    System.out.println("cars = " + cars);
    
        
        
        //Hashset es una coleccion donde cada elemento es unico no se permite duplicado
        HashSet<String> cars2 = new HashSet<String>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("BMW");  // Duplicate
        cars2.add("Mazda");
        System.out.println("cars2 = " + cars2);

        // HashMap almacena pares clave-valor que son valores y se pueden encontrar por una clave (como un nombre o ID)
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        // Imprimir ejemplo
        System.out.println(capitalCities.get("USA")); // Debería imprimir: Berlin
    }
}
