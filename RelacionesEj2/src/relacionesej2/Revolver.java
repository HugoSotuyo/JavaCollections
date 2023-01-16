/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej2;

import java.util.Random;

/**
 *
 * @author hdsot
 */
public class Revolver {
    private int posicActualTambor;
    private int posicAgua;
    Random posic=new Random();
    
    public Revolver() {
    }
    
    public Revolver(int posicActualTambor, Integer posicAgua) {
        this.posicActualTambor = posicActualTambor;
        this.posicAgua = posicAgua;
    }

    public int getPosicActualTambor() {
        return posicActualTambor;
    }

    public void setPosicActualTambor(int posicActualTambor) {
        this.posicActualTambor = posicActualTambor;
    }

    public int getPosicAgua() {
        return posicAgua;
    }

    public void setPosicAgua(int posicAgua) {
        this.posicAgua = posicAgua;
    }

    
    public Revolver llenarRevolver(){
        Revolver revolverLleno=new Revolver();
        revolverLleno.setPosicActualTambor(posic.nextInt(8));
        revolverLleno.setPosicAgua(posic.nextInt(8));
        System.out.println(revolverLleno.toString());
        return revolverLleno;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicActualTambor=" + posicActualTambor + ", posicAgua=" + posicAgua + '}';
    }
    
    public Boolean mojar(){
        Boolean mojado=false;
        if(posicActualTambor==posicAgua){
            mojado=true;
        }
        return mojado; 
    }
    public void siguienteChorro(){
        posicActualTambor=posic.nextInt(9);
        System.out.println(posicActualTambor);
    }
}
