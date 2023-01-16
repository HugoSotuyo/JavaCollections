/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author hdsot
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String mail;
    private Vehiculo vehiculo;
    private Cuota cuotaGenerada;
    
    public Cliente() {
    }
 
    public Cliente(String nombre, String apellido, String dni, String telefono, String mail, Vehiculo vehiculo,Cuota cuotaGenerada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.vehiculo = vehiculo;
        this.cuotaGenerada=cuotaGenerada;
    }

    public Cuota getCuotaGenerada() {
        return cuotaGenerada;
    }

    public void setCuotaGenerada(Cuota cuotaGenerada) {
        this.cuotaGenerada = cuotaGenerada;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono + ", mail=" + mail + '}';
    }
    
}
