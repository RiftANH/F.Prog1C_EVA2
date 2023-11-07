package com.mycompany.eva2_22_do_while_2;

import java.util.Scanner;
public class EVA2_22_DO_WHILE_2 {
    private static final Scanner input = new Scanner (System.in);
    
    final static String NOMBRE_USUARIO = "Admin";
    final static String PASSWORD = "Admin";

    public static void main(String[] args) {
        String usuario;
        String pwd;
        
        do {
            System.out.println("introduce el usuario: ");
            usuario = input.nextLine();
            System.out.println("introduce la contraseña: ");
            pwd = input.nextLine();
        }while((usuario.equals(NOMBRE_USUARIO)) || (pwd.equals(PASSWORD)));  
        System.out.println("Bienvenido al sistema!! ");
    }
}
