/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;

/**
 *
 * @author hdsot
 */
public class LibroServicio {
    public void mostrarLibro(ArrayList<String> libros){
        System.out.println("La lista de libros es: ");
        for(String libro : libros)
            System.out.println(libro.toString()); 
        }
}
    

