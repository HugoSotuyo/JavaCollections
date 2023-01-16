/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author hdsot
 */
public class Pelicula {
    private String nomPelicula;
    private Integer durMinuto;
    private Integer edadMinima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String nomPelicula, Integer durMinuto, Integer edadMinima, String director) {
        this.nomPelicula = nomPelicula;
        this.durMinuto = durMinuto;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getNomPelicula() {
        return nomPelicula;
    }

    public void setNomPelicula(String nomPelicula) {
        this.nomPelicula = nomPelicula;
    }

    public Integer getDurMinuto() {
        return durMinuto;
    }

    public void setDurMinuto(Integer durMinuto) {
        this.durMinuto = durMinuto;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nomPelicula=" + nomPelicula + ", durMinuto=" + durMinuto + ", edadMinima=" + edadMinima + ", director=" + director + '}';
    }
    
}
