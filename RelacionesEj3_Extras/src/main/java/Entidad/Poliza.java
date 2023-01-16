/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Poliza {
    private Cliente cliente;
    private Integer numPoliza;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private Integer cantCuotas;
    private Double montoAseg;
    private Boolean granizo;
    private Double montoGranizo;
    private String tipoCobertura;
    private List<Cuota> cuotaGenerada;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Poliza() {
    }

    public Poliza(Cliente cliente, Integer numPoliza, LocalDate fechaIni, LocalDate fechaFin, Integer cantCuotas, Double montoAseg, Boolean granizo, Double montoGranizo, String tipoCobertura, List<Cuota> cuotaGenerada) {
        this.cliente = cliente;
        this.numPoliza = numPoliza;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.cantCuotas = cantCuotas;
        this.montoAseg = montoAseg;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
        this.cuotaGenerada = cuotaGenerada;
    }

    public List<Cuota> getCuotaGenerada() {
        return cuotaGenerada;
    }

    public void setCuotaGenerada(List<Cuota> cuotaGenerada) {
        this.cuotaGenerada = cuotaGenerada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(Integer numPoliza) {
        this.numPoliza = numPoliza;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(Integer cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public Double getMontoAseg() {
        return montoAseg;
    }

    public void setMontoAseg(Double montoAseg) {
        this.montoAseg = montoAseg;
    }

    public Boolean getGranizo() {
        return granizo;
    }

    public void setGranizo(Boolean granizo) {
        this.granizo = granizo;
    }

    public Double getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(Double montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "cliente=" + cliente + ", numPoliza=" + numPoliza + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin  + ", \n cantCuotas=" + cantCuotas + ", montoAseg=" + montoAseg + ", granizo=" + granizo + ", montoGranizo=" + montoGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }

    
    public Poliza llenarPoliza(Integer numeroPoliza){
        Poliza polizaLlena=new Poliza();
        Cliente clienteNuevo=new Cliente();
        Vehiculo vehiculoNuevo=new Vehiculo();
        List<Cuota> cuotaGenerada;
        Double montoGranizo=0.0;
        Double riesgoTotal=0.0;
        Double monto=0.0;
        
        polizaLlena.setNumPoliza(numPoliza);
        System.out.println("Ingrese datos de Cliente");
        System.out.println("Nombre");
        String nombre=leer.next();
        System.out.println("Apellido");
        String apellido=leer.next();
        System.out.println("DNI");
        String dni=leer.next();
        System.out.println("Numero de Telefono");
        String telefono=leer.next();
        System.out.println("mail");
        String mail=leer.next();
        clienteNuevo.setApellido(apellido);
        clienteNuevo.setNombre(nombre);
        clienteNuevo.setDni(dni);
        clienteNuevo.setTelefono(telefono);
        clienteNuevo.setMail(mail);
        
        
        System.out.println("_______________________________");
        System.out.println("Ingrese datos del vehiculo");
        System.out.println("Marca");
        String marca=leer.next();
        System.out.println("Modelo año");
        String modelo=leer.next();
        System.out.println("Numero de Motor");
        String numMotor = leer.next();
        System.out.println("Numero de Chasis");
        String numChasis=leer.next();
        System.out.println("Color");
        String color = leer.next();
        System.out.println("Tipo: Sedan,Camioneta,Camion");
        String tipo=leer.next();
        System.out.println("___________________________________");
        vehiculoNuevo.setMarca(marca);
        vehiculoNuevo.setModeloAnio(modelo);
        vehiculoNuevo.setNumMotor(numMotor);
        vehiculoNuevo.setNumChasis(numChasis);
        vehiculoNuevo.setColor(color);
        vehiculoNuevo.setTipo(tipo);
        clienteNuevo.setVehiculo(vehiculoNuevo);
        
        polizaLlena.setCliente(clienteNuevo);
        
        System.out.println("Ingrese Fecha de inicio dd/mm/aaaa ");
        System.out.println(" DIA ");
        int dia=leer.nextInt();
        System.out.println(" MES ");
        int mes=leer.nextInt();
        System.out.println(" AÑO ");
        int anio=leer.nextInt();
        LocalDate fechaNueva=LocalDate.of(anio, mes, dia);
        
        polizaLlena.setFechaIni(fechaNueva);
        
        System.out.println("_______________________________________");
        System.out.println("Ingrese Fecha de finalizacion dd/mm/aa ");
        System.out.println(" DIA ");
        int diaf=leer.nextInt();
        System.out.println(" MES ");
        int mesf=leer.nextInt();
        System.out.println(" AÑO ");
        int aniof=leer.nextInt();
        LocalDate fechaNuevaFin= LocalDate.of(aniof, mesf, diaf);
        
        polizaLlena.setFechaFin(fechaNuevaFin);
        
        System.out.println("_______________________________________");
        System.out.println("Cantidad de Cuotas 6/12/24");
        polizaLlena.cantCuotas=leer.nextInt();
        System.out.println("Monto asegurado ");
        monto=leer.nextDouble();
        System.out.println("Cobertura Granizo si/no");
        String rta=leer.next();
        if (rta.equalsIgnoreCase("si")) {
            polizaLlena.setGranizo(true);
            montoGranizo = monto * 0.1;
            polizaLlena.setMontoGranizo(montoGranizo);
        }
        System.out.println("Tipo de cobertura: ");
        System.out.println("Total/Terceros ");
        rta=leer.next();
        polizaLlena.setTipoCobertura(rta);
        if (rta.equalsIgnoreCase("total")) {
            riesgoTotal = monto * 0.2;
        }
        
        polizaLlena.setMontoAseg((monto+riesgoTotal+montoGranizo));
        cuotaGenerada=crearCuotas(polizaLlena.getMontoAseg(),polizaLlena.getCantCuotas(),anio,mes,polizaLlena);
        
        polizaLlena.setCuotaGenerada(cuotaGenerada);
        
        return polizaLlena;
    }
    public List<Cuota> crearCuotas(Double montoAseg, Integer numCuotas, int anio,int mes,Poliza polizaLlena){
        List<Cuota> cuotas = new ArrayList();
        
        Double valorCuota=(montoAseg/numCuotas)*0.1;;
        int n=0;
        for (int i = 0; i < numCuotas; i++) {
            Cuota cuotaGeneradaNueva = new Cuota();
            
            cuotaGeneradaNueva.setMontoCuota(valorCuota);
            cuotaGeneradaNueva.setNumCuota(i+1);
            cuotaGeneradaNueva.setPagado(false);
             int mesCuota = mes+i-(n*12);
             if(mesCuota==12){
                n++;
             }
            LocalDate fechaCuota= LocalDate.of(anio, mesCuota,10);
            cuotaGeneradaNueva.setFechaVencimiento(fechaCuota);
            cuotas.add(cuotaGeneradaNueva);
        }
        return cuotas;
    }
    public void mostrarCuotas(List<Cuota> cuotas){
        for(Cuota cuotaUnitaria : cuotas){
            System.out.println(cuotaUnitaria.toString());
        }
}
    public void pagarCuota(int numeroPoliza, ArrayList<Poliza> polizaCarpeta){
        System.out.println("Ingrese numero de Poliza ");
        int num = leer.nextInt();
        if (num < numeroPoliza + 1) {
            System.out.println("Ingrese numero de cuota");
            int numCuota = leer.nextInt();
            if (numCuota < polizaCarpeta.get(num - 1).getCantCuotas() + 1) {
                System.out.println("Ingrese forma de pago ");
                String formaPago = leer.next();
                polizaCarpeta.get(num - 1).getCuotaGenerada().get(numCuota - 1).setFormaPago(formaPago);
                polizaCarpeta.get(num - 1).getCuotaGenerada().get(numCuota - 1).setPagado(true);
                System.out.println("Su pago fue realizado con exito");
            } else {
                System.out.println("Numero de cuota equivocado");
            }
        } else {
            System.out.println("*******************************");
            System.out.println("Numero de poliza equivocado");
            System.out.println("Debe ingresar un numero entre 1 y " + numeroPoliza);
            System.out.println("**********************************");
        }
    }
    public void mostrarCuota(int numeroPoliza, ArrayList<Poliza> polizaCarpeta){
        System.out.println("Ingrese numero de Poliza ");
        int num = leer.nextInt();
        if (num < numeroPoliza + 1) {
            System.out.println("Ingrese numero de cuota");
            int numCuota = leer.nextInt();
            if (numCuota < polizaCarpeta.get(num - 1).getCantCuotas() + 1) {
                System.out.println(polizaCarpeta.get(num - 1).getCuotaGenerada().get(numCuota - 1).toString());
            } else {
                System.out.println("Numero de cuota equivocado");
            }
        } else {
            System.out.println("*******************************");
            System.out.println("Numero de poliza equivocado");
            System.out.println("Debe ingresar un numero entre 1 y " + numeroPoliza);
            System.out.println("**********************************");
        }
    }
    public void mostrarPoliza(int numeroPoliza, ArrayList<Poliza> polizaCarpeta){
        System.out.println("Ingrese numero de Poliza ");
                    int num = leer.nextInt();
                    if (num < numeroPoliza + 1) {
                        System.out.println(polizaCarpeta.get(num - 1).toString());
                    } else {
                        System.out.println("*******************************");
                        System.out.println("Numero de poliza equivocado");
                        System.out.println("Debe ingresar un numero entre 1 y " + numeroPoliza);
                        System.out.println("**********************************");
                    }
    }
}
