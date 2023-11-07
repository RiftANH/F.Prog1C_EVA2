package com.mycompany.eva2_16_factorial;

import java.util.Scanner;
public class EVA2_16_FACTORIAL {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        int num;
      System.out.println("introduce el número:");
      num = input.nextInt();
      //vamos a calcular el factorial
      //1. PRIMERO HAY QUE TENER UN CICLO QUE GENERE LOS NÚMEROS
      //QUE INTERVIENEN EN EL FACTORIAL --> 3 -> 3, 2, 1
      int factorial = 1;
              
      for (int i = num; i >= 1; i--) {
         System.out.print(i + " X ");
         factorial = factorial * i;

      }
      System.out.println("factorial de " + num + " es = " + factorial);
        }
    }