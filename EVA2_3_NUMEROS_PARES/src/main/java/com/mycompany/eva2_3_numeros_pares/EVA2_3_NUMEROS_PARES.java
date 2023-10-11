package com.mycompany.eva2_3_numeros_pares;

import java.util.Scanner;
public class EVA2_3_NUMEROS_PARES {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Introduce calificacion");
        int valor;
        int residuo;
        
        System.out.println("valor");
        valor=input.nextInt();
        residuo=valor%2;
        if (residuo ==0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("el numero es impar");
        }
        System.out.println("Fin del Programa");
    }
}
