/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class JugadorServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Jugador cargarJugador() {
        String rta = "";
        Jugador jugadorNuevo = new Jugador();

        System.out.println("Ingrese nombre:");
        String nombre = leer.next();
        nombre = nombre.toUpperCase();
        System.out.println("Ingrese apellido:");
        String apellido = leer.next();
        apellido = apellido.toUpperCase();
        System.out.println("Ingrese posicion:");
        String posicion = leer.next();
        posicion = posicion.toUpperCase();
        System.out.println("Ingrese numero de camiseta:");
        Integer numcamiseta = leer.nextInt();

        jugadorNuevo.setApellido(apellido);
        jugadorNuevo.setNombre(nombre);
        jugadorNuevo.setPosicion(posicion);
        jugadorNuevo.setNumero(numcamiseta);
        
        return jugadorNuevo;
    }
    public void mostrarEquipo(ArrayList<Jugador> equipo){
        ArrayList<Jugador>equiponuevo=new ArrayList(equipo);
        System.out.println("____________________________");
        for (Jugador aux:equiponuevo){
            System.out.println(aux);
        }
    }        
    
}
