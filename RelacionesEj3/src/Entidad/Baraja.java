/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author hdsot
 */
public class Baraja {
    private Integer numCarta;
    String palo;
    ArrayList<Baraja>maso;

    public Baraja() {
    }

    public Baraja(Integer numCarta, String palo, ArrayList<Baraja> maso) {
        this.numCarta = numCarta;
        this.palo = palo;
        this.maso = maso;
    }

    public Integer getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(Integer numCarta) {
        this.numCarta = numCarta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public ArrayList<Baraja> getMaso() {
        return maso;
    }

    public void setMaso(ArrayList<Baraja> maso) {
        this.maso = maso;
    }

    @Override
    public String toString() {
        return " {"  + numCarta +" "+  palo  + '}';
    }
    
}
