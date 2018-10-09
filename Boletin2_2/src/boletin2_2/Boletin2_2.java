/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;

import java.util.Scanner;
/**
 *
 * @author aparcerozas
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float celsius, kelvin, fahren;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca los grados centígrados:");
        celsius = teclado.nextFloat();
        kelvin = celsius + 273.15f;
        fahren = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " grados centígrados equivale a " 
        + kelvin + " grados Kelvin y a " + fahren + " grados Fahrenheit");
    }
    
}
