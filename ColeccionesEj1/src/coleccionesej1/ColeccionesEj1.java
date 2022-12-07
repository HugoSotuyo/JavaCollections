/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej1;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class ColeccionesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Perro> perros = new ArrayList();//Creamos una lista de tipo Perro
        //que se llama perros
        String respuesta = "";
        do {
            Perro p1 = new Perro(); //Creamos un objeto tipo Perro para ponerlo en la
            //lista perros
            System.out.println("Ingrese la raza de el perro ");
            String raza = leer.next();
            p1.setRaza(raza);//cargamos p1 con raza
            perros.add(p1);// agregamos el perro a la lista
            System.out.println("Desea ingresar otro perro ? ");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("si"));
        for (Perro aux : perros) {
            System.out.println(aux);
        }
        Iterator<Perro>it=perros.iterator();
        boolean borrado=false;
        System.out.println("Indique el perro que desea borrar ");
        String borrarRaza= leer.next();
        while (it.hasNext()) {
            if (it.next().getRaza().equalsIgnoreCase(borrarRaza)) {
                it.remove();
                borrado=true;

            } 
        }
        if(borrado==false){
        
                System.out.println("El perro no se encuentra en la lista ");
               // borrado=true;
            }
        for (Perro auxiliar : perros) {
            System.out.println(auxiliar);
        }
        //}
    }
}
