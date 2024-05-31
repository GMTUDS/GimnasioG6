/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Rebeca
 */
public class Membresia {
    private int idMembresia;
    private Socio Socio;
    private  int cantidadPases;
    private Date fechaInicio;
    private Date fechaFin;
    private double costo;
    private boolean estado;
 public Membresia(int idMembresia, Socio Socio, int cantidadPases, Date fechaInicio, Date fechaFin, double costo, boolean estado) {
        this.idMembresia = idMembresia;
        this.Socio = Socio;
        this.cantidadPases = cantidadPases;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costo = costo;
        this.estado = estado;
    }
     public Membresia(Socio Socio, int cantidadPases, Date fechaInicio, Date fechaFin, double costo, boolean estado) {
        this.Socio = Socio;
        this.cantidadPases = cantidadPases;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costo = costo;
        this.estado = estado;
    }
      public Membresia() {
    }


    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public Socio getSocio() {
        return Socio;
    }

    public void setSocio(Socio Socio) {
        this.Socio = Socio;
    }

    public int getCantidadPases() {
        return cantidadPases;
    }

    public void setCantidadPases(int cantidadPases) {
        this.cantidadPases = cantidadPases;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

     @Override
    public String toString() {
        return idMembresia + " "+Socio+" "+cantidadPases+" "+ fechaInicio+" "+fechaFin+" "+costo+" "+estado;
    }
}
