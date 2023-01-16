/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import Entidad.Sala;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class CineServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Espectador crearEspect(){
        Espectador espectador =new Espectador();
        
        System.out.println("Nombre : ");
        String nombre=leer.next();
        System.out.println("Edad : ");
        Integer edad = leer.nextInt();
        System.out.println("Dinero : ");
        Integer dinero = leer.nextInt();
        
        espectador.setNombre(nombre);
        espectador.setEdad(edad);
        espectador.setDinero(dinero);
                
        return espectador;
    }
    public Pelicula crearPelicula(){
        Pelicula peli=new Pelicula();
        System.out.println("Ingrese nombre de la Pelicula");
        String nombPeli=leer.next();
        System.out.println("Ingrese duracion en minutos");
        Integer duracPeli=leer.nextInt();
        System.out.println("Ingrese edad apto");
        Integer edadPeli=leer.nextInt();
        System.out.println("Ingrese Director");
        String direPeli=leer.next();
        
        peli.setNomPelicula(nombPeli);
        peli.setDurMinuto(duracPeli);
        peli.setEdadMinima(edadPeli);
        peli.setDirector(direPeli);
        return peli;
    }
    public Sala crearSala() {
        Sala sala = new Sala();
        String[][] capacidad = new String[8][6];
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                capacidad[i][j] = " ";
            }
        }
        
        sala.setSala(capacidad);
        return sala;
    }
    public Cine cargarCine(){
        Cine cine = new Cine();
        cine.setPeli(crearPelicula());
        System.out.println("#####################################");
        cine.setSala(crearSala());
        System.out.println("Ingrese valor de la entrada");
        Double precio = leer.nextDouble();
        cine.setPrecio(precio);
        return cine;
    }
    public void ubicar() {
        System.out.println("Cuantos espectadores desea cargar ? ");
        Integer cantEspect = leer.nextInt();
        Integer num = cantEspect;
        Integer fila;
        Integer columna;
        int espacio = 48;
        Cine cineNuevo = new Cine();
        cineNuevo = cargarCine();
        System.out.println("___________________________________________");
        Random posic = new Random();
        Sala salaNueva = crearSala();
        salaNueva.setEstado(false);
        String[][] matrizUbicacion = new String[8][6];
        matrizUbicacion = salaNueva.getSala();

        for (int i = 0; i < cantEspect; i++) {
            while (num > 0 && espacio > 0) {
                Espectador espectNuevo = new Espectador();
                espectNuevo = crearEspect();
                System.out.println("///////////////////////////////////////");
                if(espectNuevo.getDinero()<cineNuevo.getPrecio()){
                    System.out.println("Dinero insuficiente");
                }
                if (espectNuevo.getEdad() < cineNuevo.getPeli().getEdadMinima()) {
                    System.out.println("Edad menor a la permitida");
                }
                if (espectNuevo.getDinero() >= cineNuevo.getPrecio() && espectNuevo.getEdad() >= cineNuevo.getPeli().getEdadMinima()) {
                    do {
                        fila = posic.nextInt(8);
                        columna = posic.nextInt(6);
                    } while (!(matrizUbicacion[fila][columna]).equalsIgnoreCase(" "));
                    matrizUbicacion[fila][columna] = "X";
                    num--;
                    espacio--;
                }
                if (espacio == 0) {
                    System.out.println("SALA LLENA");
                }
            }
        }
        for (int i = 8; i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                int valorAscii = 65 + j;
                char caracterConv = (char) valorAscii;
                System.out.print(i + "" + caracterConv + "  " + matrizUbicacion[i - 1][j] + " |");
            }
            System.out.println("");
        }
    }
}
