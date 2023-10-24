package com.mycompany.eva2_10_carreras;

import java.util.Scanner;
public class EVA2_10_CARRERAS {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        String carrera;
        System.out.println("Introducir iniciales de la carrera");
        carrera = input.nextLine();
        
        switch (carrera){
            case "ISC":
                System.out.println("INGENIERIA EN SISTEMAS COMPUTACIONALES");
                break;
            case "INF":
                System.out.println("INGENIERIA INFORMATICA");
                break;
            case "IND":
                System.out.println("INGENIERIA INDUSTRIAL");
                break;
            case "IDI":
                System.out.println("INGENIERIA EN DISEÑO INDUSTRIAL");
                break;
            case "IGE":
                System.out.println("INGENIERIA EN GESTION EMPRESARIAL");
                break;
            case "LA":
                System.out.println("LICENCIATURA EN ADMINISTRACION");
                break;
            case "ARQ":
                System.out.println("ARQUITECTURA");
                break;
            default:
                System.out.println(carrera + " NO son iniciales validas");
        }
    }
}