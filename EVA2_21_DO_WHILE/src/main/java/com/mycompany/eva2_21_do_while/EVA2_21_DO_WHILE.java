package com.mycompany.eva2_21_do_while;

import java.util.Scanner;
public class EVA2_21_DO_WHILE {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        int valor;
        //asegura almenos una vez la ejecucion de las instrucciones dentro del ciclo
        do{
            System.out.println("");
            valor = input.nextInt();  
        }while(valor != 100);
    }
}
