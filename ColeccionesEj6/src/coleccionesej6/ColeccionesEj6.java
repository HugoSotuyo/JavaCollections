/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej6;

import Servicio.ProductoServicio;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class ColeccionesEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoServicio prodServ = new ProductoServicio();
        String opc = "";
        String salir = "N";
        do {
            System.out.println("Elija la operacion a realizar");
            System.out.println("A: Cargar Producto");
            System.out.println("B: Modificar Precio");
            System.out.println("C: Eliminar Producto");
            System.out.println("D: Salir");
            opc = leer.next();
            opc = opc.toUpperCase();
            switch (opc) {
                case "A":
                    prodServ.cargarProducto();
                    System.out.println("===============================");
                    prodServ.mostrarMapa();
                    break;
                case "B":
                    prodServ.modificarPrecio();
                    System.out.println("================================");
                    prodServ.mostrarMapa();
                    break;
                case "C":
                    prodServ.eliminarProducto();
                    System.out.println("=================================");
                    prodServ.mostrarMapa();
                    break;
                case "D":
                    System.out.println("Esta seguro que desea SALIR? S/N");
                    salir = leer.next();
                    break;
            }
        } while (salir.equalsIgnoreCase("N"));
    }
}
