package com.mycompany.eva2_9_switch;

import java.util.Scanner;
public class EVA2_9_SWITCH {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        //Solicitar numero de mes.
        int mes;
        System.out.println("Introduce el Numero de mes");
        mes = input.nextInt();
        
        switch (mes){
            case 1:
                System.out.println("ENERO");
                break;//TERMINA EL SWITCH
            case 2:
                System.out.println("FEBRERO");
                break;
            case 3:
                System.out.println("MARZO");
                break;
            case 4:
                System.out.println("ABRIL");
                break;
            case 5:
                System.out.println("MAYO");
                break;
            case 6:
                System.out.println("JUNIO");
                break;
            case 7:
                System.out.println("JULIO");
                break;
            case 8:
                System.out.println("AGOSTO");
                break;
            case 9:
                System.out.println("SEPTIEMBRE");
                break;
            case 10:
                System.out.println("OCTURBE");
                break;
            case 11:
                System.out.println("NOVIEMBRE");
                break;
            case 12:
                System.out.println("DICIEMBRE");
                break;
            default: //Siempre al final, es opcional, no tiene break
                System.out.println("El numero "+mes+" NO es un mes valido");
        }
    }
}
