/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author hdsot
 */
public class Sala {
    private String[][] sala;
    private Boolean estado;

    public Sala() {
    }

    public Sala(String[][] sala, Boolean estado) {
        this.sala = sala;
        this.estado = estado;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Sala{" + "sala=" + sala + ", estado=" + estado + '}';
    }
    
}
