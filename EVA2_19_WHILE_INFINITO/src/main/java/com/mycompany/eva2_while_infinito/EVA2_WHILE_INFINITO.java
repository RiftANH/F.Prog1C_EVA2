package com.mycompany.eva2_while_infinito;

import java.util.Scanner;
public class EVA2_WHILE_INFINITO {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        int nume = 100;
        int captu = 0;
        
        while(true){ //ciclo infinito, por si solo, nunca se va detener
            System.out.println("Introduce un número:");
            captu = input.nextInt();
            if(captu == nume){
                System.out.println("Adivinaste");
                break; //romper --> detiene la ejecución del ciclo

            }
        
        
        }
    }
}
