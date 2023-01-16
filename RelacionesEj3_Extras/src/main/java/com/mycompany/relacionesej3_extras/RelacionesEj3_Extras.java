/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relacionesej3_extras;

import Entidad.Poliza;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class RelacionesEj3_Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Poliza polizaServ = new Poliza();
        ArrayList<Poliza> polizaCarpeta= new ArrayList();
        Integer numeroPoliza=0;
        int opcion;
        int num;
        String salir="N";
        
        do{
            System.out.println("*****MENU******");
            System.out.println(" 1 - Generar Poliza");
            System.out.println(" 2 - Mostrar Cuotas");
            System.out.println(" 3 - Mostrar Poliza");
            System.out.println(" 4 - Mostrar Cuota");
            System.out.println(" 5 - Pagar Cuota");
            System.out.println(" 6 - Salir");
            System.out.println("----------------------");
            System.out.println("Seleccione la opcion ");
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    numeroPoliza++;
                    polizaCarpeta.add(polizaServ.llenarPoliza(numeroPoliza));
                    System.out.println(polizaCarpeta.get(numeroPoliza - 1).getCliente().toString());
                    System.out.println(polizaCarpeta.get(numeroPoliza - 1).getFechaIni());
                    break;
                case 2:
                    System.out.println("Ingrese numero de Poliza ");
                    num = leer.nextInt();
                    if (num < numeroPoliza + 1) {
                        polizaServ.mostrarCuotas(polizaCarpeta.get(num - 1).getCuotaGenerada());
                    } else {
                        System.out.println("*******************************");
                        System.out.println("Numero de poliza equivocado");
                        System.out.println("Debe ingresar un numero entre 1 y " + numeroPoliza);
                        System.out.println("**********************************");
                    }
                    break;
                case 3:
                    polizaServ.mostrarPoliza(numeroPoliza, polizaCarpeta);
                    break;
                case 4:
                    polizaServ.mostrarCuota(numeroPoliza, polizaCarpeta);
                    break;
                case 5:
                    polizaServ.pagarCuota(numeroPoliza, polizaCarpeta);
                    break;
                case 6:
                    System.out.println("Desea abandonar el Programa s/n");
                    salir = leer.next();
                    break;
            }
        }while(salir.equalsIgnoreCase("n"));
    }
}
