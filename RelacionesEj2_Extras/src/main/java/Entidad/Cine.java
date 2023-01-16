/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author hdsot
 */
public class Cine {
    private Pelicula peli;
    private Sala sala;
    private Double precio;

    public Cine() {
    }

    public Cine(Pelicula peli, Sala sala, Double precio) {
        this.peli = peli;
        this.sala = sala;
        this.precio = precio;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "peli=" + peli + ", sala=" + sala + ", precio=" + precio + '}';
    }
    
    
}
