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
public class Persona {
    private String nombrepers;
    private String apellido;
    private Integer edad;
    private Integer numDoc;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombrepers, String apellido, Integer edad, Integer numDoc, Perro perro) {
        this.nombrepers = nombrepers;
        this.apellido = apellido;
        this.edad = edad;
        this.numDoc = numDoc;
        this.perro = perro;
    }

    public String getNombrepers() {
        return nombrepers;
    }

    public void setNombrepers(String nombrepers) {
        this.nombrepers = nombrepers;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Integer numDoc) {
        this.numDoc = numDoc;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombrepers=" + nombrepers + ", apellido=" + apellido + ", edad=" + edad + ", numDoc=" + numDoc + ", perro=" + perro + '}';
    }
    
}
