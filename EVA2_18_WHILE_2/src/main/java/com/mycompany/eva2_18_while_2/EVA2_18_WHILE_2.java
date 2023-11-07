package com.mycompany.eva2_18_while_2;

import java.util.Scanner;
public class EVA2_18_WHILE_2 {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        int nume = 100;
        int captu = 0;
        
        
        while(captu != nume){
            System.out.println("introduce el número");
            captu = input.nextInt();
            if (captu == nume)
                System.out.println("Adivinaste");
            }
    }
}
