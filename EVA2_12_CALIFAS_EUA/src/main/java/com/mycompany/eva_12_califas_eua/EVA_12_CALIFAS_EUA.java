package com.mycompany.eva_12_califas_eua;

import java.util.Scanner;
public class EVA_12_CALIFAS_EUA {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        int califa;
        System.out.println("Introducir Calificacion");
        califa=input.nextInt();
        
        if((califa>=90) && (califa<=100)) 
                System.out.println("La nota es A");
            else if(califa>=80 && califa<=89)
                System.out.println("La nota es B");
            else if(califa>=70 && califa<=79)
                System.out.println("La nota es C");
            else if(califa>=60 && califa<=69)
                System.out.println("La nota es D");
            else if(califa>0 && califa<60)
                System.out.println("La nota es F");
            else {
                System.out.println("Calificacion no Valida");
            }
            }
}
