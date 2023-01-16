/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobra2;

import Entidades.Equipo;
import Entidades.Jugador;
import Servicio.JugadorServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class ManosALaObra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugadorNuevo = new Jugador();
        Equipo EquipoNuevo = new Equipo();
        ArrayList<Jugador> equipoNuevo = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        JugadorServicio jugServ = new JugadorServicio();
        String rta = "";
        do {
            System.out.println("Desea agregar un jugador al equipo ? Si/No");
            rta = leer.next();
            if (rta.equalsIgnoreCase("Si")) {
                jugadorNuevo = jugServ.cargarJugador();
                equipoNuevo.add(jugadorNuevo);
            }
        } while (rta.equalsIgnoreCase("Si"));
        jugServ.mostrarEquipo(equipoNuevo);
    }
}


