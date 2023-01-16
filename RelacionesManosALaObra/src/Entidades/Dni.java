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
public class Dni {
    private String tipo;
    private Integer num;

    public Dni() {
    }

    public Dni(String tipo, Integer num) {
        this.tipo = tipo;
        this.num = num;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Dni{" + "tipo=" + tipo + ", num=" + num + '}';
    }
   
}
