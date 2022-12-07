/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class PeliculaServicio {
    private ArrayList<Pelicula> pelicula = new ArrayList();
    Scanner leer = new Scanner (System.in,"ISO-8859-1").useDelimiter("\n");
   
    public void cargarPelicula() {

        String respuesta = "";
        do {
            Pelicula peli = new Pelicula();
            System.out.println("Ingrese Titulo de la pelicula ");
            String titulo = leer.next();
            System.out.println("Ingrese Director de la pelicula ");
            String director = leer.next();
            System.out.println("Ingrese Duracion de la pelicula ");
            int duracion = leer.nextInt();

            peli.setDirector(director);
            peli.setTitulo(titulo);
            peli.setDuracion(duracion);

            pelicula.add(peli);
            System.out.println("Desea cargar otra Pelicula si/no: ");
            respuesta=leer.next();

        } while (respuesta.equals("si"));
    }
    
    public void mostrarPelicula(){
        System.out.println("====================================================");

        for(Pelicula aux : pelicula) {
            System.out.println(" DIRECTOR : " + aux.getDirector());
            System.out.println(" TITULO : " + aux.getTitulo());
            System.out.println(" DURACION : " + aux.getDuracion());
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        }
    }
    public void peliMayor1Hora(){
        System.out.println("====================================================");
        for(Pelicula aux : pelicula){
            if(aux.getDuracion()>60){
            System.out.println(" DIRECTOR : " + aux.getDirector());
            System.out.println(" TITULO : " + aux.getTitulo());
            System.out.println(" DURACION : " + aux.getDuracion());
            System.out.println("--------------------------------------"); 
            }
        }
    }
            
    public void ordenarDuracionDesc(){
        pelicula.sort(Pelicula.ascendenteDuracion);
        System.out.println("====================================================");
        for (Pelicula aux : pelicula){
            System.out.println(" DIRECTOR : " + aux.getDirector());
            System.out.println(" TITULO : " + aux.getTitulo());
            System.out.println(" DURACION : " + aux.getDuracion());
            System.out.println("///////////////////////////////////////");    
        }
    }
    public void ordenarDuracionAsc(){
        pelicula.sort(Pelicula.descendenteDuracion);
        System.out.println("====================================================");
        for (Pelicula aux : pelicula){
            System.out.println(" DIRECTOR : " + aux.getDirector());
            System.out.println(" TITULO : " + aux.getTitulo());
            System.out.println(" DURACION : " + aux.getDuracion());
            System.out.println("///////////////////////////////////////");    
        }
    }
    public void ordenarTitulo(){
        pelicula.sort(Pelicula.ordenTitulo);
        System.out.println("====================================================");
        for (Pelicula aux : pelicula){
            System.out.println(" DIRECTOR : " + aux.getDirector());
            System.out.println(" TITULO : " + aux.getTitulo());
            System.out.println(" DURACION : " + aux.getDuracion());
            System.out.println("///////////////////////////////////////");    
        }
    }
    public void ordenarDirector(){
        pelicula.sort(Pelicula.ordenDirector);
        System.out.println("====================================================");
        for (Pelicula aux : pelicula){
            System.out.println(" DIRECTOR : " + aux.getDirector());
            System.out.println(" TITULO : " + aux.getTitulo());
            System.out.println(" DURACION : " + aux.getDuracion());
            System.out.println("///////////////////////////////////////");    
        }
    }
}


