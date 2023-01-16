/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej3;

import Entidad.Baraja;
import Servicio.barajaServicio;
import java.util.ArrayList;

/**
 *
 * @author hdsot
 */
public class RelacionesEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            barajaServicio barServ = new barajaServicio();
            ArrayList<Baraja> maso=new ArrayList();
            ArrayList<Baraja> masoListo=new ArrayList();
            
            maso=barServ.cargarMaso();
            System.out.println(maso.toString());
            
            masoListo=barServ.barajar(maso);
            System.out.println(masoListo.toString());
    }
    
}
