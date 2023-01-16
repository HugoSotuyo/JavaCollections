/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Baraja;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author hdsot
 */
public class barajaServicio {
    Random baraj = new Random();

    public ArrayList<Baraja> cargarMaso() {
             
        
        ArrayList<Baraja> masoNuevo = new ArrayList();

        for (int j = 1; j < 13; j++) {
            Baraja barajanueva = new Baraja();
            barajanueva.setNumCarta(j);
            barajanueva.setPalo("ORO");
            masoNuevo.add(barajanueva);
        }
        for (int i = 1; i < 13; i++) {
            Baraja barajanueva = new Baraja();
            barajanueva.setNumCarta(i);
            barajanueva.setPalo("BASTO");
            masoNuevo.add(barajanueva);
        }
        for (int k = 1; k < 13; k++) {
            Baraja barajanueva = new Baraja();
            barajanueva.setNumCarta(k);
            barajanueva.setPalo("ESPADA");
            masoNuevo.add(barajanueva);
        }
        for (int l = 1; l < 13; l++) {
            Baraja barajanueva = new Baraja();
            barajanueva.setNumCarta(l);
            barajanueva.setPalo("COPA");
            masoNuevo.add(barajanueva);
        }
        
        return masoNuevo;
    }
    public ArrayList<Baraja> barajar(ArrayList<Baraja> maso) {
        ArrayList<Baraja> masoListo = new ArrayList();
        ArrayList<Baraja> masoListo1 = new ArrayList();
        ArrayList<Integer> cartas = new ArrayList();
        int index;
        Random random = new Random();

        for (int i = 0; i < maso.size(); i++) {
            index = random.nextInt(maso.size());
            if (cartas.contains(index)) {
                i = i - 1;
            } else {
                cartas.add(index);
                masoListo.add(maso.get(index));
            }
        }
        Iterator<Baraja>it=masoListo.iterator();
        while(it.hasNext()){
            if(it.next().getNumCarta().equals(9)){
                it.remove();
            }
        }
        masoListo1=masoListo;
        Iterator<Baraja>it1=masoListo1.iterator();
        while(it1.hasNext())
            if(it1.next().getNumCarta().equals(8)){
                it1.remove();
            }
        masoListo=masoListo1;
        return masoListo;
    }

}
