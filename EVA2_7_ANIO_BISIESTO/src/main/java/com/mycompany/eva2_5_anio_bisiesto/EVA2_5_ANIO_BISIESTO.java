package com.mycompany.eva2_5_anio_bisiesto;

import java.util.Scanner;
public class EVA2_5_ANIO_BISIESTO {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Introduce año a evaluar:");
        int year, resi4, resi100, resi400;
        year= input.nextInt();
        
        resi4=year%4;
        resi100=year%100;
        resi400=year%400;
        
        if((resi4==0)&&((resi100!=0) || (resi400==0)))
            System.out.println("El año "+year+" es bisiesto");
        else
            System.out.println("El año "+year+" NO bisiesto");
        
    }
}
