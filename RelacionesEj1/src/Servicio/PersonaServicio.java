/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        Persona personaNueva=new Persona();
        
        System.out.println("Ingrese nombre de persona");
        String nombre=leer.next();
        nombre=nombre.toUpperCase();
        System.out.println("Ingrese apellido");
        String apellido=leer.next();
        apellido=apellido.toUpperCase();
        System.out.println("Ingrese edad de persona");
        Integer edad=leer.nextInt();
        System.out.println("Ingrese documento");
        Integer documento=leer.nextInt();
        
        personaNueva.setApellido(apellido);
        personaNueva.setNombrepers(nombre);
        personaNueva.setEdad(edad);
        personaNueva.setNumDoc(documento);
        
        return personaNueva;
    }
    public Perro crearPerro(){
        Perro perro =new Perro();
        
        System.out.println("Ingrese nombre del perro");
        String nombreperro=leer.next();
        nombreperro=nombreperro.toUpperCase();
        System.out.println("Ingrese raza");
        String raza=leer.next();
        raza=raza.toUpperCase();
        System.out.println("Ingrese edad del perro");
        Integer edad=leer.nextInt();
        System.out.println("Ingrese tamaño del perro");
        Double tamaño=leer.nextDouble();
        
        perro.setNombre(nombreperro);
        perro.setRaza(raza);
        perro.setEdad(edad);
        perro.setTamaño(tamaño);
        
        return perro;
    }
    
}
