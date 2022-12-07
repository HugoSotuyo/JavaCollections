/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej5;

import Servicio.PaisServicio;

/**
 *
 * @author hdsot
 */
public class ColeccionesEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServicio paisServ = new PaisServicio();
        
        paisServ.cargarPais();
        paisServ.ordenar();
        paisServ.eliminar();
    }
    
}
