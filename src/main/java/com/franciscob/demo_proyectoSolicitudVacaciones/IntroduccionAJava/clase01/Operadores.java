package com.franciscob.demo_proyectoSolicitudVacaciones.IntroduccionAJava.clase01;

public class Operadores {
    public static void main(String[] args) {
        int x = 100 + 90;
        System.out.println("x = " + x);

        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;

        System.out.println("sum3 = " + sum3);
        
        int yx = 9;
        
        ++yx;
        System.out.println("yx = " + yx);
        
        
        --yx;
        System.out.println("yx = " + yx);

        int savings = 100;
        savings += 50;

        System.out.println("tus abono ahora tienes" + " : " + "$"+ savings);

        int xx = 5;
        int yy = 3;
        System.out.println(true);
        // returns true, because 5 is higher than 3

        boolean isLoggean = true;
        boolean isAdmin = false;

        System.out.println("Regular user" + (isLoggean && !isAdmin));
        System.out.println("Has access: " + (isLoggean || isAdmin));
        System.out.println("Not logged in: " + (!isLoggean));

        String txt = "Hello World";
        System.out.println("txt.toUpperCase() = " + txt.toUpperCase());
        System.out.println("txt.toUpperCase() = " + txt.toLowerCase());
        
        //Encontrar un caracter en una cadena
        //metodo index
        String txt2= "Pelase locate where 'locate' occurs!";
        System.out.println("txt2.indexOf(\"locate\") = " + txt2.indexOf("locate"));


        String txt3 = "Hello";
        System.out.println(txt3.charAt(0));
        System.out.println(txt3.charAt(4));

        String txt4 = "Hello";
        String txt5 = "Hello";

        System.out.println("txt4 = " + txt4.equals(txt5));
        System.out.println("txt4 = " + txt5.equals(txt4));

        String txt6 = "   Hello World   ";
        System.out.println("Before: [" + txt6 + "]");
        System.out.println("After:  [" + txt6.trim() + "]");

    }
}
