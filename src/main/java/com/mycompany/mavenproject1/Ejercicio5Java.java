/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author edili
 */
/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
*/
public class Ejercicio5Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num=leer.nextInt();
        System.out.println("El doble del número: "+(num*2));
        System.out.println("El triple del número: "+(num*3));
        System.out.println("La raíz cuadrada del número: "+sqrt(num));
    }
    
}
