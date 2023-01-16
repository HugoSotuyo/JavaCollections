/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej1;


import Servicio.PersonaServicio;


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

        persServ.cargar();
        persServ.adoptar();
        
       
    }
}
