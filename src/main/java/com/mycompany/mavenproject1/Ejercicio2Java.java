/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author edili
 */
/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
*/
public class Ejercicio2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre:");
        String nombre=leer.nextLine();
        
        System.out.println("El nombre ingresado es "+nombre);
        
    }
    
}
