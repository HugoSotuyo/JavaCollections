/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej4;

import Servicio.PeliculaServicio;

/**
 *
 * @author hdsot
 */
public class ColeccionesEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio peliServ = new PeliculaServicio();
        peliServ.cargarPelicula();
        peliServ.mostrarPelicula();
        peliServ.peliMayor1Hora();
        peliServ.ordenarDuracionDesc();
        peliServ.ordenarDuracionAsc();
        peliServ.ordenarTitulo();
        peliServ.ordenarDirector();
    }
    
}
