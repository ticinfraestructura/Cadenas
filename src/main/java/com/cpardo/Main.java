package com.cpardo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//        String cadena1 = "Hello World!";
//        String cadena2 = new String("Hello World");
//        System.out.println("Los objetos son iguales?" + (cadena1==cadena2));
//        System.out.println("Los contendios don iguales ?" + cadena1.equals(cadena2));
//        System.out.println("Valor = " +cadena1.compareTo("Hello World!"));
        int n=12;
        test(18);
        System.out.println("Valor de n Global = " + n);
        System.out.println("Esta es una nueva modificación al código para probar entonces");

    }
    static void  test ( int n){
        System.out.println("Este es el  = " + n);
        n=9;
        System.out.println("Este es el  valor local = " + n);
    }
}