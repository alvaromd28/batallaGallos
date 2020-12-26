package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Competicion {
    private String nombre;
    private Date fechaInicio;
    private Date fechaFinal;
    private List<String> paisesAceptados;

    public Competicion(String nombre, Date fechaInicio, Date fechaFinal, List<String> paisesAceptados) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.paisesAceptados = paisesAceptados;
    }
}
