package com.mycompany.eva2_20_while_retiros;

import java.util.Scanner;
public class EVA2_20_WHILE_RETIROS {

    public static void main(String[] args) {
        int canti = 1000;
        Scanner input = new Scanner(System.in);
        
        while(canti > 0 ){ //mientras haya saldo, se puede retirar
            System.out.println("¿Cuánto dinero deseas retirar");
            int retiro = input.nextInt();       
            //acumulador
            //canti = canti - retiro;                 
            canti-=retiro;
            System.out.println("te quedan $" + canti + " de saldo");
        }
    }
}
