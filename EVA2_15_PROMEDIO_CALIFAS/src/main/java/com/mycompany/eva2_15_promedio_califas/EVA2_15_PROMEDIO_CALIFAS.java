package com.mycompany.eva2_15_promedio_califas;

import java.util.Scanner;
public class EVA2_15_PROMEDIO_CALIFAS {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        int cantCali;
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce el numero de calificaciones a capturar");
        cantCali = input.nextInt();
        int sumaCali = 0;
        
        //ACOMULADOR
        
        for (int i = 0; i < cantCali; i++) {
            System.out.println("Introduce calificacion");
            int califa = input.nextInt();
            //ACOMULADOR
            sumaCali = sumaCali + califa;
            //sumaCali+=califa;
        }
        
        System.out.println("La sumatoria = " + sumaCali);
        //si el divisor es 
        double promedio = sumaCali / cantCali *1.0;
        System.out.println("El promedio de calificaciones es = " + promedio);
        }
        
    }
