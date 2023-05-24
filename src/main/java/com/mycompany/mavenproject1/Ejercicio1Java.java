/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author edili
 */

/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
*/
public class Ejercicio1Java {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       
        System.out.println("Ingresar primer número");
        int num1=leer.nextInt();
        System.out.println("Ingresar segundo número");
        int num2=leer.nextInt();
        System.out.println("La suma de ambos números es: "+(num1+num2));
    }
}
