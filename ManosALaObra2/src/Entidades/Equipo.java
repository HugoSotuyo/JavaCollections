/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author hdsot
 */
public class Equipo {
    ArrayList<Jugador> jugador;

    public Equipo() {
    }

    public Equipo(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

    public ArrayList<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Equipo{" + "jugador=" + jugador + '}';
    }
    
}
