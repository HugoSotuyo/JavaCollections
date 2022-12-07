/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej3;

import Entidad.Alumno;
import Servicio.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class ColeccionesEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno> listaNueva = new ArrayList();
        AlumnoServicio alumServ = new AlumnoServicio();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String respuesta = "";
        String cargar = "";
        int contador = 0;
        String nombre = null;
        //Cargo los alumnos a la lista, para ello llamo al metodo cargarAlumnos
        do {
            listaNueva.add(alumServ.cargarAlumnos());
            System.out.println("Desea agregar otro alumno ?");
            cargar = leer.next();
        } while (cargar.equalsIgnoreCase("si"));
        //muestro la lista de alumnos con el metodo mostrarTodas
        alumServ.mostrarTodas(listaNueva);
        System.out.println("Desea calcular una nota final ");
        respuesta = leer.next();
        //pregunto si quiere ver alguno nota final
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el nombre del alumno ");
            nombre = leer.next();
            //busco en la lista por medio de Aux2
            for (int i = 0; i < listaNueva.size(); i++) {
                Alumno Aux2 = listaNueva.get(i);
                //si encuentro el nombre en la lista, muestro la nota final
                //por medio de el metodo notafinal
                if (Aux2.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println(alumServ.notafinal(nombre, listaNueva));
                } else {
                    contador = contador + 1;
                    if (contador == listaNueva.size()) {
                        System.out.println("El alumno que ingreso no esta en la lista");
                    }
                }
            }
        }
    }
}
    

