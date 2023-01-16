/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author hdsot
 */
public class Perro {
    private String nombre;
    private String raza;
    private Integer edad;
    private Double tamaño;
    private Boolean adoptado;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, Double tamaño,Boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.adoptado = adoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }

    public Boolean getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(Boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return  "Nombre = " + nombre + " // Raza = " + raza + " // Edad = " + edad + " // Altura = " + tamaño ;
    }
    

   
}
