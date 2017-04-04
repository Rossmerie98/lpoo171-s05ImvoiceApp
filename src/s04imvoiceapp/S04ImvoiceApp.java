/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s04imvoiceapp;

/**
 *
 * @author alumno
 */
public class S04ImvoiceApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a la Aplicacion Total Factura");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese Subtotal:   ");
        double subtotal = sc.nextDouble();
        double impuesto = subtotal = 0.25;
        double descuento = subtotal * 0.10;
        double total = subtotal + impuesto;
        
        String mensaje = "Total Factura:" + total + "\n";
        System.out.println(mensaje);
    }
}
     