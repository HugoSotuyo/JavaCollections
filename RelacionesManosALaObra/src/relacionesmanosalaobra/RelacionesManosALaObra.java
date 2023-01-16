/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesmanosalaobra;

import Entidades.Dni;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class RelacionesManosALaObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Dni dninuevo = new Dni();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rta = "";
        do {
            System.out.println("Desea ingresar una persona si/no ? ");
            rta = leer.next();
            if(rta.equalsIgnoreCase("si")){
            System.out.println("Ingrese Nombre");
            String nombre = leer.next();
            nombre = nombre.toUpperCase();
            System.out.println("Ingrese Apellido");
            String apellido = leer.next();
            apellido = apellido.toUpperCase();

            System.out.println("Ingrese tipo de documento");
            String tipoDni = leer.next();
            tipoDni = tipoDni.toUpperCase();
            dninuevo.setTipo(tipoDni);
            System.out.println("Ingrese numero de documento");
            Integer numDni = leer.nextInt();
            dninuevo.setNum(numDni);

            persona1.setApellido(apellido);
            persona1.setNombre(nombre);
            persona1.setDni(dninuevo);

            System.out.println("La persona cargado es: ");
            System.out.println(persona1.toString());
            }
        } while (rta.equalsIgnoreCase("si"));
    }

}
