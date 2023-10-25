package com.mycompany.eva2_11_cadenas;

import java.util.Scanner;
public class EVA2_11_CADENAS {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        
       System.out.println("Introducir texto");
       String cade;
       cade=input.nextLine();
       
       if(cade.equals("HOLA"))
            System.out.println("LAS CADENAS SON IGUALES");
       else
            System.out.println("LAS CADENAS SON DIFERENTES");
               
              
    }
    
}