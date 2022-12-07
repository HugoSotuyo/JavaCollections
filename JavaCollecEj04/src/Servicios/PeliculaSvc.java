/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import java.util.Scanner;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author A308862
 */
public class PeliculaSvc {
 
    Scanner scn = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    ArrayList<Pelicula> listPeli = new ArrayList();
    
    
    public Pelicula crearPelicula() {
        
        String Titulo="";
        String Director="";
        double Duracion=0;
                
        Pelicula peli = new Pelicula();
        
        System.out.println("Ingrese Titulo:");
        Titulo=scn.next();
        
        System.out.println("Ingrese Director:");
        Director=scn.next();
        
        System.out.println("Ingrese Duracion:");
        Duracion=scn.nextDouble();
        
        peli.setTitulo(Titulo);
        peli.setDirector(Director);
        peli.setDuracion(Duracion);
        
        return peli;
    }
    
    
    public void CargaPeliculas() {
        int opc=0;
        do {
            listPeli.add(crearPelicula());
            System.out.println("Desea ingresar otro? (0-Si 1-No): ");
            opc=scn.nextInt();
        } while (opc==0);
    }
    
    
    public void mostrarTodas() {
        System.out.println("====================================================");
        for (Pelicula aux : listPeli) {
            System.out.println("Titulo: " + aux.getTitulo() + " Director: " + aux.getDirector() + " Duracion:" + aux.getDuracion());
        }
    }
    
    public void mostrarTodas1() {
        System.out.println("====================================================");
        for (Pelicula aux : listPeli) {
            if (aux.getDuracion() > 1 ) {
                System.out.println("Titulo: " + aux.getTitulo() + " Director: " + aux.getDirector() + " Duracion:" + aux.getDuracion());
            }
        }
    }
    
    
    public void ordena(String orden) {
        switch (orden) {
            case "A":
            Collections.sort(listPeli, Pelicula.ascendenteDuracion);
            break;
            case "D":
            Collections.sort(listPeli, Pelicula.descendenteDuracion);
            break;
            case "T":
            Collections.sort(listPeli, Pelicula.ascendenteTitulo);
            break;
            case "d":
            Collections.sort(listPeli, Pelicula.ascendenteDirector);
            break;
        }
        mostrarTodas();
    }
    

   
    
    
    
}
