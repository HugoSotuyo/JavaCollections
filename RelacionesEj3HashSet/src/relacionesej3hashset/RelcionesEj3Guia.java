/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej3hashset;

import Servicio.BarajaServicio;

/**
 *
 * @author hdsot
 */
public class RelcionesEj3Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarajaServicio BarajServ = new BarajaServicio();
        BarajServ.cargarMaso();
        BarajServ.menu();
    }
    
}
