package model;

import java.util.List;

public class Fase {
    private String Nombre;
    private float Presupuesto;
    private List<String> PaisSede;

    public Fase(String nombre, float presupuesto, List<String> paisSede) {
        Nombre = nombre;
        Presupuesto = presupuesto;
        PaisSede = paisSede;
    }
}
