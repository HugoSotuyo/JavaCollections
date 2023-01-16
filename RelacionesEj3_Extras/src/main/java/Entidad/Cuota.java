/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;

/**
 *
 * @author hdsot
 */
public class Cuota {
    private Integer numCuota;
    private Double montoCuota;
    private Boolean pagado;
    private LocalDate fechaVencimiento;
    private String formaPago;

    public Cuota() {
    }

    public Cuota(Integer numCuota, Double montoCuota, Boolean pagado, LocalDate fechaVencimiento, String formaPago) {
        this.numCuota = numCuota;
        this.montoCuota = montoCuota;
        this.pagado = pagado;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public Integer getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(Integer numCuota) {
        this.numCuota = numCuota;
    }

    public Double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(Double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numCuota=" + numCuota + ", montoCuota=" + montoCuota + ", pagado=" + pagado + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + '}';
    }
    
}
