package model;

import java.util.List;

public class Fase {
    private String Nombre;
    private float Presupuesto;
    private Pais PaisSede;

    public Fase(String nombre, float presupuesto, Pais paisSede) {
        Nombre = nombre;
        Presupuesto = presupuesto;
        PaisSede = paisSede;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public float getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        Presupuesto = presupuesto;
    }

    public Pais getPaisSede() {
        return PaisSede;
    }

    public void setPaisSede(Pais paisSede) {
        PaisSede = paisSede;
    }
}
