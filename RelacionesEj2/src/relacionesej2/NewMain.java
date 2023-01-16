/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego juegoServ=new Juego();
        Revolver revServ=new Revolver();
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
            //Creo revolver Lleno y Jugadores Lleno para pasarle a la clase Juego
        Revolver revLleno = new Revolver ();
        ArrayList<Jugador> jugLleno = new ArrayList();
            //Lleno revolver usando llenarRevolver en la clase Revolver
        revLleno=revServ.llenarRevolver();
        
            //Cargo los jugadores creados en un ArrayList
        ArrayList<Jugador>jugadoresLleno =new ArrayList();
        Boolean mojado=false;
        Integer cont=0;
        System.out.println("Ingrese numeros de jugadores");
        Integer numJugadores=leer.nextInt();
        do  {
            Jugador jugadorNuevo=new Jugador();
            System.out.println("Ingrese jugador ");
            String nombreJug=leer.next();
            jugadorNuevo.setId(cont);
            jugadorNuevo.setNombre(nombreJug);
            jugadorNuevo.setMojado(mojado);
            jugadoresLleno.add(jugadorNuevo);
            cont++;
        }while(cont<numJugadores);
            //Lleno el Juego        
        juegoServ.llenarJuego(jugadoresLleno, revLleno);
            //Arranco el Juego
        juegoServ.ronda();
    }
    
}
