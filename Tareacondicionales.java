/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareacondicionales;

import java.util.Scanner;

/**
 *
 * @author jamer
 */
public class Tareacondicionales {

    public static void main(String[] args) {
              Scanner entrada = new Scanner (System.in);
              System.out.println("ingrese su nombre:");
              String nombre= entrada.nextLine();
              System.out.println("ingrese su apellido:");
              String apellido = entrada.nextLine();
              System.out.println("ingrese su edad:");
             int edad = entrada.nextInt();
             System.out.println("ingrese su sexo 1.masculino/ 2.femenino:");
            int sexo=entrada.nextInt();
             
             switch (sexo){
                 case 1 -> System.out.println(" es masculino");
                        case 2 -> System.out.println(" es femenino");
             
             }
             
             if (edad>=18){
                 System.out.println(" es mayor de edad");
             }
             else {
                 System.out.println("es menor de edad");
             }
             
            
        
        
        
        
        
        
    }
}
