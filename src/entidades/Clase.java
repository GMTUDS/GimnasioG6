/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author NandoJ
 */
public class Clase {
    private int idClase;
    private String Nombre;
    private int idEntrenador;
    private LocalTime horario;
    private int capacidad;
    private boolean estado;

    public Clase() {
    }

    public Clase(String Nombre, int idEntrenador, LocalTime horario, int capacidad, boolean estado) {
        this.Nombre = Nombre;
        this.idEntrenador = idEntrenador;
        this.horario = horario;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Clase(int idClase, String Nombre, int idEntrenador, LocalTime horario, int capacidad, boolean estado) {
        this.idClase = idClase;
        this.Nombre = Nombre;
        this.idEntrenador = idEntrenador;
        this.horario = horario;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Clase{" + "idClase=" + idClase + ", Nombre=" + Nombre + ", idEntrenador=" + idEntrenador + ", horario=" + horario + ", capacidad=" + capacidad + ", estado=" + estado + '}';
    }
    
}
