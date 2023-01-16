/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej2;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Jugador {
    private Integer id;
    private String nombre;
    private Boolean mojado;
    private Integer numJug;
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
   
    public Jugador() {
    }

    public Jugador(Integer id, String nombre, Boolean mojado, Integer numJug) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
        this.numJug = numJug;
    }
       
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    public Integer getNumJug() {
      return numJug;
    }

    public void setNumJug(Integer numJug) {
        this.numJug = numJug;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    public Boolean disparo(Revolver r){
        Boolean resultDisparo=false;
        String rta = "";
        System.out.println("Listo para disparar s/n");
        rta=leer.next();
        
        if(rta.equalsIgnoreCase("s")){
            r.siguienteChorro();
            resultDisparo=r.mojar();
            System.out.println(resultDisparo.toString());
            System.out.println();
        }else{
            resultDisparo=false;
        }
        return resultDisparo;
    }
   
}
