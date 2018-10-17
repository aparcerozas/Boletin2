/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;
/**
 *
 * @author aparcerozas
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int b100, b20, b5, m1, dinero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número de billetes de 100€:");
        b100 = teclado.nextInt();
        System.out.println("Introduzca el número de billetes de 20€:");
        b20 = teclado.nextInt();
        System.out.println("Introduzca el número de billetes de 5€:");
        b5 = teclado.nextInt();
        System.out.println("Introduzca el número de monedas de 1€:");
        m1 = teclado.nextInt();
        dinero = b100*100 + b20*20 + b5*5 + m1;
        System.out.println("La cantidad de dinero introducida es de " + dinero + "€");
    } 
}
