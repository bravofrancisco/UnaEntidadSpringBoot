package com.franciscob.demo_proyectoSolicitudVacaciones.IntroduccionAJava.clase01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExpresionLambda {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach(method);

        List<String> nombres = Arrays.asList("Francisco","Manuel");
        nombres.forEach(nombre-> System.out.println("nombres = " + nombres));
    }
}
