/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Comparator;

/**
 *
 * @author hdsot
 */
public class Pelicula {
   private String titulo,director;
    private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    } 
    public static Comparator<Pelicula> ascendenteDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    public static Comparator<Pelicula> descendenteDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    public static Comparator<Pelicula> ordenTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
