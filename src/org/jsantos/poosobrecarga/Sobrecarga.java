package org.jsantos.poosobrecarga;

import static org.jsantos.poosobrecarga.Calculadora.*;

public class Sobrecarga {

    public static void main(String[] args) {



        System.out.println("Sumar int: "+ sumar(10,5)  );
        System.out.println("Suma float-int: " +sumar(10.0F,5));
        System.out.println("Suma float-int"+ sumar(10,0.5F));
        System.out.println("Suma String-String"+ sumar("20","25"));

        System.out.println("Sumar 4 enteros" + sumar(10,5,35,68,45));
        System.out.println("Sumar float + n enteros" + sumar(10.5F,5,35,68,45));
        System.out.println("Sumar double + n enteros" + sumar(10.8,5,5,35,68,45,25));
    }
}
