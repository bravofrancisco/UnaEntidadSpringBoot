package com.franciscob.demo_proyectoSolicitudVacaciones.IntroduccionAJava;

public class If_Else {
    public static void main(String[] args) {
        boolean isRiniing = true;
        int n1 = 20;
        int n2= 18;
        if (isRiniing){
            System.out.println("Bring an umbrella = " + isRiniing);
        }

        if(n1> n2){
            System.out.println(" eres mayor = " + n1);
        }

        boolean isLightOn= false;

        if (isLightOn){
            System.out.println("isLightOn  esta ibn= " + isLightOn);
        }else{
            System.out.println("this line run no matter what, because it is outs");
        }


    }
}
