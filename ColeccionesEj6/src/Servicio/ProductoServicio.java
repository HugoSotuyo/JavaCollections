/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class ProductoServicio {
    private HashMap<String,Producto> mapa;//creo el mapa, el primer termino es el
                                            //tipo de dato de la llave y el segundo es el tipo
                                            //tipo de dato que es el objeto a guardar
    private Scanner leer;
   
    public ProductoServicio(){
        this.mapa=new HashMap();//creo el espacio en memoria de el mapa
        this.leer=new Scanner(System.in).useDelimiter("\n");//uando llamo a la clase
                                                           //habilito el flujo de datos
    }
    public void cargarProducto(){
        String rta="";
        do{
            System.out.println("Desea Ingresar un producto?");
            rta=leer.next();
            if(rta.equalsIgnoreCase("si")){
                System.out.println("Ingrese producto");
                String productoIngresado=leer.next();
                System.out.println("Ingrese valor");
                Double valorIngresado=leer.nextDouble();
                //Agrego elemntos al mapa, el primer termino corresponde a la key
                mapa.put(productoIngresado, new Producto(productoIngresado, valorIngresado));
            }
        }while (rta.equalsIgnoreCase("si"));
    }
    public void modificarPrecio(){
        Producto productonuevo = new Producto();
        String rta="";
        System.out.println("Desea modificar un precio si/no");
        rta=leer.next();
        if(rta.equalsIgnoreCase("si")){
            System.out.println("Ingrese producto a modificar");
            String producto=leer.next();
            System.out.println("Ingrese nuevo valor");
            Double nuevovalor=leer.nextDouble();
        productonuevo.setProducto(producto);
        productonuevo.setPrecio(nuevovalor);
        mapa.put(producto,productonuevo);
        }
    }
    public void mostrarMapa(){
        for(Map.Entry<String,Producto> entry:mapa.entrySet()){
            System.out.println("Producto="+entry.getKey()+", Datos del "+entry.getValue());
        }
        System.out.println("======================================");
    }
    public void eliminarProducto(){
        System.out.println("Ingrese el producto que desea eliminar");
        String producto=leer.next();
        mapa.remove(producto);
    }
}
