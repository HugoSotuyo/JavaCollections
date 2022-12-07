/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

/**
 *
 * @author hdsot
 */
public class Libro {
    String nombre;
    String autor;
    Integer cantHojas;

    public Libro() {
    }

    public Libro(String nombre, String autor, Integer cantHojas) {
        this.nombre = nombre;
        this.autor = autor;
        this.cantHojas = cantHojas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getCantHojas() {
        return cantHojas;
    }

    public void setCantHojas(Integer cantHojas) {
        this.cantHojas = cantHojas;
    }

    @Override
    public String toString() {
        return "libros{" + "nombre=" + nombre +  '}';
    }
    
}
