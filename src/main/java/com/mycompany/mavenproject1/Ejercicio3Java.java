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

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/
public class Ejercicio3Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        String frase=leer.nextLine();
        
        System.out.println("Frase en minúsculas: "+frase.toLowerCase());
        
        System.out.println("Frase en mayúsculas: "+frase.toUpperCase());
       
    }
    
}
