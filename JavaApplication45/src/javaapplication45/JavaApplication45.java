/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

import Servicio.LibroServicio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author hdsot
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> libros = new ArrayList();
        HashSet<Integer> numerosB = new HashSet();
        HashMap<Integer,String> alumnos = new HashMap();
        LibroServicio libServ = new LibroServicio();
        libros.add("La Herida");
        libros.add("El puñal");
        libros.add("Cien años de soledad");
        libros.add("El alquimista");
        libros.add("Juan Salvador Gaviota");
        
        
        System.out.println(libros);
        libServ.mostrarLibro(libros);
        
        //numerosA.remove(2);//remuevo lista por indice
        //numerosA.remove(13);//remuevo lista por objeto
        
        numerosB.add(20);
        numerosB.add(21);
        numerosB.add(22);
        numerosB.add(23);
        numerosB.add(24);
        
        numerosB.remove(22);//remuevo conjunto(set) por objeto
        
        alumnos.put(22724817,"Hugo");
        alumnos.put(22724818,"Hugo1");
        alumnos.put(22724819,"Hugo2");
        alumnos.put(22724820,"Hugo3");
        alumnos.put(22724821,"Hugo4");
        
        alumnos.remove(22724820);//remuevo por llave
        
    }
    
}
