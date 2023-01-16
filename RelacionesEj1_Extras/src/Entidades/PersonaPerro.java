/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author hdsot
 */
public class PersonaPerro {
    private Perro perroAdoptado;
    private Persona personaAdopta;

    public PersonaPerro() {
    }

    public PersonaPerro(Perro perroAdoptado, Persona personaAdopta) {
        this.perroAdoptado = perroAdoptado;
        this.personaAdopta = personaAdopta;
    }

    public Perro getPerroAdoptado() {
        return perroAdoptado;
    }

    public void setPerroAdoptado(Perro perroAdoptado) {
        this.perroAdoptado = perroAdoptado;
    }

    public Persona getPersonaAdopta() {
        return personaAdopta;
    }

    public void setPersonaAdopta(Persona personaAdopta) {
        this.personaAdopta = personaAdopta;
    }

    @Override
    public String toString() {
        return "PERRO ADOPTADO " + perroAdoptado + "// PERSONA " + personaAdopta + '}';
    }
    
    
}
