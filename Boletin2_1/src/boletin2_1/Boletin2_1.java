/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;

import java.util.Scanner;
/**
 *
 * @author aparcerozas
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float precioTar, precioPago, porcentaje, porcentajeDesc;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el precio de tarifa:");
        precioTar = teclado.nextFloat();
        System.out.println("Introduzca el precio de pago:");
        precioPago = teclado.nextFloat();
        porcentaje = precioPago * 100 / precioTar;
        porcentajeDesc = 100 - porcentaje;
        System.out.println("El porcentaje de descuento de la compra es del " 
        + porcentajeDesc + " %");
    }
    
}
