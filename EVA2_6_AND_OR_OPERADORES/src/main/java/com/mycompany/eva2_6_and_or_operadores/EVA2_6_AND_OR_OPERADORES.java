package com.mycompany.eva2_6_and_or_operadores;

import java.util.Scanner;
public class EVA2_6_AND_OR_OPERADORES {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Introducir Calificacion");
        int califa;
        califa = input.nextInt();
        
        if((califa >=0) && (califa <=100)){
            System.out.println("La calificacion " + califa + " es valida");
            if (califa >=70)
                System.out.println("Acreditas");
            else
                System.out.println("No acreditas");
        }else{
            System.out.println("La calificacion " + califa + " NO valida");
        }
    }
}
