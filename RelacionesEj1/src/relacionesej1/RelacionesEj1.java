/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej1;

import Entidades.Perro;
import Entidades.Persona;
import Servicio.PersonaServicio;
import java.util.ArrayList;

/**
 *
 * @author hdsot
 */
public class RelacionesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio persServ = new PersonaServicio();

        ArrayList<Persona> persona = new ArrayList();
        ArrayList<Perro> perro = new ArrayList();
        Persona personaNueva = new Persona();
        Perro perroNuevo = new Perro();
        for (int i = 0; i < 2; i++) {
        personaNueva = persServ.crearPersona();
        perroNuevo = persServ.crearPerro();
        personaNueva.setPerro(perroNuevo);
        persona.add(personaNueva);
        }
        for (Persona aux : persona) {
            System.out.println(aux.toString());
        }
    }
}
