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
public class Maso {
    private ArrayList<Carta> maso;

    public Maso() {
    }

    public Maso(ArrayList<Carta> maso) {
        this.maso = maso;
    }

    public ArrayList<Carta> getMaso() {
        return maso;
    }

    public void setMaso(ArrayList<Carta> maso) {
        this.maso = maso;
    }

    @Override
    public String toString() {
        return "Maso{" + "maso=" + maso + '}';
    }
    
}
