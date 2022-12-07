/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author A308862
 */
public class Pelicula {
    private String Titulo, Director;
    private Double Duracion;

    public Pelicula() {
    }

    public Pelicula(String Titulo, String Director, Double Duracion) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.Duracion = Duracion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Double getDuracion() {
        return Duracion;
    }

    public void setDuracion(Double Duracion) {
        this.Duracion = Duracion;
    }
    
    public static Comparator<Pelicula> ascendenteDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    public static Comparator<Pelicula> descendenteDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ascendenteTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t) {
            return t1.getTitulo().compareTo(t.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ascendenteDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t) {
            return t1.getDirector().compareTo(t.getDirector());
        }
    };
        
}
    
    
    
    
    
    
