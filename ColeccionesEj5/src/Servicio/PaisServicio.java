/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class PaisServicio {
   Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n");
   HashSet<String>paises=new HashSet();
    public void cargarPais() {
        String respuesta = "";
        String pais;
        do {
            System.out.println("Ingrese Pais");
            pais = leer.next();
            paises.add(pais);
            System.out.println("Desea ingresar otro pais? ");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("si"));
        System.out.println("==============================");
        for (String aux : paises) {
            System.out.println(aux);
        }
    }
    public void ordenar(){
        ArrayList<String>paisesordenados=new ArrayList(paises);
        Collections.sort(paisesordenados);
        System.out.println("____________________________");
        for (String aux:paisesordenados){
            System.out.println(aux);
        }
    }
    public void eliminar(){
        String pais="";
        int contador=0;
        Iterator<String> it = paises.iterator();
        System.out.println("Ingrese un pais para eliminar de la lista");
        pais=leer.next();
        System.out.println("/////////////////////////////////");
        while(it.hasNext()){
            if(it.next().equalsIgnoreCase(pais)){
                it.remove();
                contador=+1;
            }
            
        }
        if(contador==0){
            System.out.println("El pais no se encuentra en la lista");
        }else{
            for(String aux:paises){
                System.out.println(aux);
            }
        }
    }
}
