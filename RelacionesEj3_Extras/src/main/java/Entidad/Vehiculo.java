/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author hdsot
 */
public class Vehiculo {
    private String marca;
    private String modeloAnio;
    private String numMotor;
    private String numChasis;
    private String color;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modeloAnio, String numMotor, String numChasis, String color, String tipo) {
        this.marca = marca;
        this.modeloAnio = modeloAnio;
        this.numMotor = numMotor;
        this.numChasis = numChasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModeloAnio() {
        return modeloAnio;
    }

    public void setModeloAnio(String modeloAnio) {
        this.modeloAnio = modeloAnio;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(String numMotor) {
        this.numMotor = numMotor;
    }

    public String getNumChasis() {
        return numChasis;
    }

    public void setNumChasis(String numChasis) {
        this.numChasis = numChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modeloAnio=" + modeloAnio + ", numMotor=" + numMotor + ", numChasis=" + numChasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
}
