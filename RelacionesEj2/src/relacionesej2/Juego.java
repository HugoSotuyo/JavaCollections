/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Juego {
    ArrayList<Jugador>jugadoresJuego;
    Revolver revolverJuego = new Revolver();
    Jugador jugador = new Jugador();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores) {
        this.jugadoresJuego = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadoresJuego;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadoresJuego = jugadores;
    }

    public Revolver getRevolver() {
        return revolverJuego;
    }

    public void setRevolver(Revolver revolver) {
        this.revolverJuego = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadoresJuego + ", revolver=" + revolverJuego + '}';
    }
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        jugadoresJuego = jugadores;
        System.out.println("======================================");
        for (Jugador aux : jugadoresJuego) {
            System.out.println(aux);
        }
        revolverJuego = r;
        System.out.println(revolverJuego.toString());
    }
    public void ronda() {
        Integer numJugadores = jugadoresJuego.size();
        Boolean resultDisp = false;
        Iterator<Jugador> it = jugadoresJuego.iterator();
        int cont = 0;
        
        while (it.hasNext() && resultDisp == false) {
            System.out.println("=========================");
            resultDisp = jugador.disparo(revolverJuego);
            if (resultDisp) {
                System.out.println("El jugador mojado es " + jugadoresJuego.get(cont).getNombre());
            } else {
                System.out.println("Siguiente jugador");
                cont++;
                if (cont == 4) {
                    cont = 0;
                }
            }
        }
    }
}     


