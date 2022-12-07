/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class AlumnoServicio {

    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno cargarAlumnos() {
            String respuesta = "";
            Alumno alumnoNuevo = new Alumno();
            ArrayList<Integer> notas = new ArrayList();

            System.out.println("Ingrese el nombre: ");
            String nombreIngresado = leer.next();
            nombreIngresado = nombreIngresado.toUpperCase();
            System.out.println("Ingrese la nota 1 : ");
            Integer nota1 = leer.nextInt();
            System.out.println("Ingrese la nota 2 : ");
            Integer nota2 = leer.nextInt();
            System.out.println("Ingrese la nota 3 : ");
            Integer nota3 = leer.nextInt();

            notas.add(nota1);//cargo cada nota en la lista de notas
            notas.add(nota2);
            notas.add(nota3);

            alumnoNuevo.setNombre(nombreIngresado);//cargo en el alumno
            alumnoNuevo.setNotas(notas);
            
        
            return alumnoNuevo;
        }       
        
    
    public void mostrarTodas(ArrayList<Alumno>listaNueva) {
        System.out.println("====================================================");

        for(Alumno aux : listaNueva) {
            System.out.println("Nombre : " + aux.getNombre());
            System.out.println(" Nota 1 : " + aux.getNotas().get(0));
            System.out.println(" Nota 2 : " + aux.getNotas().get(1));
            System.out.println(" Nota 3 : " + aux.getNotas().get(2));
        }
    }
    public double notafinal(String nombre,ArrayList<Alumno>listaNueva){
        double notaf=0;
        for(Alumno aux:listaNueva){
            if(aux.getNombre().equalsIgnoreCase(nombre)){
                notaf=(aux.getNotas().get(0)+aux.getNotas().get(1)+aux.getNotas().get(2))/3;
            }
        }
        return notaf;
        
    }
}

    
