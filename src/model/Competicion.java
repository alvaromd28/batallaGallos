package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Competicion {
    private String nombre;
    private Date fechaInicio;
    private Date fechaFinal;
    private Pais[] paisesAceptados ;

    public Competicion(String nombre, Date fechaInicio, Date fechaFinal, Pais[] paisesAceptados) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.paisesAceptados = paisesAceptados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Pais[] getPaisesAceptados() {
        return paisesAceptados;
    }

    public void setPaisesAceptados(Pais[] paisesAceptados) {
        this.paisesAceptados = paisesAceptados;
    }

    public void registrarRaperos(){
    }
}
