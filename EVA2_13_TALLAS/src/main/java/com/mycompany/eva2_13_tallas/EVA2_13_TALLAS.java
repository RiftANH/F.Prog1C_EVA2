package com.mycompany.eva2_13_tallas;

import java.util.Scanner;
public class EVA2_13_TALLAS {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        int talla;
        System.out.println("Introducir talla");
        talla=input.nextInt();
        
        switch (talla) {
            case 29:
                System.out.println("Small");
                break;
            case 42:
                System.out.println("Medium");
                break;
            case 44:
                System.out.println("Large");
                break;
            case 48:
                System.out.println("XLarge");
                break;
            default:
                System.out.println("Talla desconocida");
                        
        }
    }
}
