/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Carta;
import Entidad.Maso;
import ej03.enums.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class BarajaServicio {
    
    private Collections col;
    private Maso masoNuevo = new Maso();//Llamo a la Clase Maso(ArrayList<Carta>)
    private Maso cartasEntregadas = new Maso();//en laclase maso armo uno con las cartas que entrego
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Maso cargarMaso() {
        ArrayList<Carta> cartas = new ArrayList();

        for (Palo aux : Palo.values()) {
            String p = aux.getNombre();
            for (int i = 1; i < 13; i++) {
                if (i == 8 || i == 9) {
                } else {
                    Carta c = new Carta(i, aux);
                    cartas.add(c);

                }
            }
        }
        masoNuevo.setMaso(cartas);//Cargo el maso sin 8 y 9
        for (Carta aux : cartas) {
            System.out.println(aux);
        }
        System.out.println("------------------------------------");
        System.out.println("Maso Listo");
        return masoNuevo;
    }
    public void barajar(){
        col.shuffle(masoNuevo.getMaso());
        for(Carta aux:masoNuevo.getMaso()){
            System.out.println(aux);
        }
        System.out.println("--------------------------------------");
        System.out.println("Maso Mezclado");
    }
    public Carta siguienteCarta(){
        Carta cartaMostrada = masoNuevo.getMaso().get(0);
        System.out.println("---------------------------------------");
        System.out.println("La carta es "+ masoNuevo.getMaso().get(0).toString());
        return cartaMostrada;
    }
    public void cartasDisponibles(){
        System.out.println("----------------------------------------");
        System.out.println("El numero de cartas disponibles aun es: "+masoNuevo.getMaso().size());
    }
    public void darCartas() {
        ArrayList<Carta> cartasE = new ArrayList();
        Carta cartaNueva = new Carta();
        System.out.println("Cuantas cartas quiere ");
        int num = leer.nextInt();
        System.out.println("------------------------------------------");
        if (num <= masoNuevo.getMaso().size()) {
            for (int i = 0; i < num; i++) {//Muestro cada carta que entrego
                System.out.println("Se entrega el " + masoNuevo.getMaso().get(i).toString()
                        + " al jugador");
            }
            for (int i = 0; i < num; i++) {//Saco las cartas del maso inicial y las pongo en entregadas
                cartaNueva = masoNuevo.getMaso().get(0);
                cartasE.add(cartaNueva);//agrego la carta en el array
                masoNuevo.getMaso().remove(0);
            }
            cartasEntregadas.setMaso(cartasE);//seteo en la class Maso
        } else {
            System.out.println("No hay suficientes cartas en el maso");
            cartasDisponibles();
        }
    }
    public void cartasMonton(){
        System.out.println("----------------------------------------");
        if(cartasEntregadas.getMaso().size()==0){
            System.out.println("No se ha entregado ninguna carta");
        }else{
            for(Carta aux:cartasEntregadas.getMaso()){
                System.out.println("Se entrego "+ aux.toString());
            }
        }
    }
    public void mostrarBaraja(){
        System.out.println("------------------------------------------");
        for(Carta aux:masoNuevo.getMaso()){
                System.out.println("Sin entregar: "+ aux.toString());
            }
    }
    public void menu(){
        System.out.println("//////////////////////////////////////");
        System.out.println("Seleccione una opcion");
        System.out.println("1 - BARAJAR");
        System.out.println("2 - VER SIGUIENTE CARTA");
        System.out.println("3 - CONSULTAR NUMERO DE CARTAS DISPONIBLES");
        System.out.println("4 - DAR CARTAS");
        System.out.println("5 - VER LAS CARTAS QUE SE ENTREGARON");
        System.out.println("6 - MOSTRA LAS CARTAS QUE QUEDAN SIN ENTREGAR");
        System.out.println("7 - salir");
        int opc=leer.nextInt();
        switch(opc){
            case 1:
                barajar();
                System.out.println("El maso ya esta barajado");
                menu();
                break;
            case 2:
                siguienteCarta();
                menu();
                break;
            case 3:
                cartasDisponibles();
                menu();
                break;
            case 4:
                darCartas();
                menu();
                break;
            case 5:
                cartasMonton();
                menu();
                break;
            case 6:
                mostrarBaraja();
                menu();
                break;
            case 7:
                System.out.println("Fin");
                break;
            default:
                System.out.println("Opcion incorrecta");
                menu();
        }
    }
}
