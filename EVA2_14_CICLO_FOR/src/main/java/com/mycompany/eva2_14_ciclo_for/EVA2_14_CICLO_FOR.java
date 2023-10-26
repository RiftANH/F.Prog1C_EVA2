package com.mycompany.eva2_14_ciclo_for;

public class EVA2_14_CICLO_FOR {

    public static void main(String[] args) {
        //for --> desde
        //se ejecuta desde un punto hasta otro
        //for (punto de inicio; condicion para el termino; manera de avanzar (o retroceder)
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("--------------------");
        for(int i=9; i >= 0; i--)
            System.out.println(i);
        //------------------------------
        //NUMEROS PARES DE 0 A 100
        for(int i =0; i <= 100; i+=2)
            System.out.print(i + "-");
    }
}
