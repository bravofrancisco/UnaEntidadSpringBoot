package com.franciscob.demo_proyectoSolicitudVacaciones.IntroduccionAJava;

import java.util.ArrayList;

public class MainJava {

    public static void main(String[] args) {
        System.out.println("Hello World");

        String name = "francisco";
        System.out.println("name = " + name);

        int myNum ;
        myNum = 19;
        System.out.println("myNum = " + myNum);

        int myNum2 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println("myNum2 = " + myNum2);
        System.out.println("myNum2 = " +  myFloatNum);
        System.out.println("myNum2 = " +  myLetter);
        System.out.println("myNum2 = " +  myBool);
        System.out.println("myNum2 = " +  myText);

        //final
        final int mynum =21;
//        mynum = 22;
        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

// Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        boolean isJvaFun = true;
        boolean isFishTasty = false;

        System.out.println("isJvaFun = " + isJvaFun);
        System.out.println("isJvaFun = " + isFishTasty);

        char myGrade = 'B';
        System.out.println("myGrade = " + myGrade);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;

        System.out.println("myVar1 = " + myVar1);
        System.out.println("myVar1 = " + myVar2);
        System.out.println("myVar1 = " + myVar3);

        String greeting = "Hello World";
        System.out.println(greeting);


        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';


        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

        var x = 5;
        System.out.println( "x = " + ((Object)x).getClass().getSimpleName());

        ArrayList<String> cars = new ArrayList<String>();

        var cars2 = new ArrayList<String>();
        cars2.add("Volvo");
        cars2.add("Mazda");

        System.out.println("cars2 = " + cars2);

        int num = 9;
        double   mydoble = num;

        System.out.println("num = " + num);
        System.out.println("num = " + mydoble);

    }
}
