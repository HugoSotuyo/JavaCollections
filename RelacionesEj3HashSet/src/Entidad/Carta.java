/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import ej03.enums.Palo;

/**
 *
 * @author hdsot
 */
public class Carta {
    private Integer numCarta;
    private Palo palo;
    

    public Carta() {
    }

    public Carta(Integer numCarta, Palo palo) {
        this.numCarta = numCarta;
        this.palo = palo;
        
    }

    public Integer getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(Integer numCarta) {
        this.numCarta = numCarta;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }
 
    @Override
    public String toString() {
        return  numCarta +" de "+ palo.getNombre();
    }
    
}
