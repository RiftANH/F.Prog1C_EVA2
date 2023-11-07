package com.mycompany.eva2_24_recorrer_cadena;

import java.util.Scanner;
public class EVA2_24_RECORRER_CADENA {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        String cade;
        System.out.println("introduce un texto:");
        cade = input.nextLine();
        for (int i = 0; i< cade.length(); i++) {
            System.out.println(cade.charAt(i));
        
        
        
        
        }
    }
}