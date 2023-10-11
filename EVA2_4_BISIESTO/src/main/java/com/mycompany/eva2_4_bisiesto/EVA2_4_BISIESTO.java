package com.mycompany.eva2_4_bisiesto;

import java.util.Scanner;
public class EVA2_4_BISIESTO {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Introduce año a evaluar:");
        int year, residuo;
        year= input.nextInt();
        residuo= year%4;
        if (residuo ==0) {
            residuo = year %100;
            if (residuo==0) {
                if (residuo == year%400) {
                    System.out.println("Es bisiesto");
                } else {
                    System.out.println("No es bisiesto");
            }
        } else {
                System.out.println("Es bisiesto");
            }
            }else{
            System.out.println("El año no es bisiesto");
        }
    }
}