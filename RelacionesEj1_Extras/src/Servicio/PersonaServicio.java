/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Perro;
import Entidades.Persona;
import Entidades.PersonaPerro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Persona> persona = new ArrayList();
    private ArrayList<Perro> perro = new ArrayList();
    private ArrayList<PersonaPerro> perPerro = new ArrayList();
    
    public Persona crearPersona() {

        Persona personaNueva = new Persona();

        System.out.println("Ingrese nombre de persona");
        String nombre = leer.next();
        nombre = nombre.toUpperCase();
        System.out.println("Ingrese apellido");
        String apellido = leer.next();
        apellido = apellido.toUpperCase();
        System.out.println("Ingrese edad de persona");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese documento");
        Integer documento = leer.nextInt();

        personaNueva.setApellido(apellido);
        personaNueva.setNombrepers(nombre);
        personaNueva.setEdad(edad);
        personaNueva.setNumDoc(documento);

        return personaNueva;
    }
    public Perro crearPerro() {
        Perro perro = new Perro();

        System.out.println("Ingrese nombre del perro");
        String nombreperro = leer.next();
        nombreperro = nombreperro.toUpperCase();
        System.out.println("Ingrese raza");
        String raza = leer.next();
        raza = raza.toUpperCase();
        System.out.println("Ingrese edad del perro");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese tamaño del perro");
        Double tamaño = leer.nextDouble();
        
        perro.setAdoptado(Boolean.FALSE);
        perro.setNombre(nombreperro);
        perro.setRaza(raza);
        perro.setEdad(edad);
        perro.setTamaño(tamaño);

        return perro;
    }
    public void cargar() {
        int num;
        System.out.println("Cuantas personas y perros desea ingresar ?");
        num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            Persona personaNueva = new Persona();
            Perro perroNuevo = new Perro();

            personaNueva = crearPersona();
            perroNuevo = crearPerro();

            persona.add(personaNueva);
            perro.add(perroNuevo);
        }
    }
    public void adoptar() {
        String nombPerro;
        int num = 0;
        ArrayList<PersonaPerro> perPerro = new ArrayList();
        
        do {
            Persona perAux = persona.get(num);//toma la persona indexada por num
            num = num + 1;
            int cont = 0;
            System.out.println(perAux.getNombrepers() + " que perro desea adoptar ?");
            for (Perro aux : perro) {
                System.out.println(aux.getNombre());
            }
            nombPerro = leer.next();
            for (Perro aux : perro) {
                if (aux.getNombre().equalsIgnoreCase(nombPerro)) {
                    if (aux.getAdoptado() == false) {//si el perro aun no fue adoptado
                        Persona personaNueva = new Persona();
                        Perro perroNuevo = new Perro();
                        PersonaPerro perAdoptado = new PersonaPerro();
                        cont++;
                        aux.setAdoptado(Boolean.TRUE);//para que detecte que el perro fue adoptado
                        perroNuevo.setEdad(aux.getEdad());
                        perroNuevo.setNombre(aux.getNombre());
                        perroNuevo.setRaza(aux.getRaza());
                        perroNuevo.setTamaño(aux.getTamaño());

                        personaNueva.setApellido(perAux.getApellido());
                        personaNueva.setEdad(perAux.getEdad());
                        personaNueva.setNombrepers(perAux.getNombrepers());
                        personaNueva.setNumDoc(perAux.getNumDoc());

                        perAdoptado.setPersonaAdopta(personaNueva);
                        perAdoptado.setPerroAdoptado(perroNuevo);

                        perPerro.add(perAdoptado);
                    } else {
                        System.out.println("Este perro ya fue adoptado");
                        num = num - 1;//vuelvo a tomar la persona
                        cont++;//para que no mande el otro mensaje
                    }
                }
            }
            if (cont == 0) {
                System.out.println("El perro seleccionado no esta en la lista");
                num = num - 1;
            }
        } while (num < persona.size());
//Muestro la lista final
        Iterator<PersonaPerro> it = perPerro.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}
    
