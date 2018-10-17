/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;
/**
 *
 * @author aparcerozas
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dinero, b100, b20, b5, m1, dineroInicial;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el dinero en número entero:");
        dinero = teclado.nextDouble();
        dineroInicial = dinero;
        b100 = Math.floor(dinero / 100);
        dinero = dinero - (b100 * 100);
        b20 = Math.floor(dinero / 20);
        dinero = dinero - (b20 * 20);
        b5 = Math.floor(dinero / 5);
        dinero = dinero - (b5 * 5);
        m1 = dinero;
        System.out.println((int)dineroInicial + "€ está formado por " + (int)b100 +
        " billetes de 100€, " + (int)b20 + " billetes de 20€, " + (int)b5 +
        " billetes de 5€ y " + (int)m1 + " monedas de 1€");
    }  
}
