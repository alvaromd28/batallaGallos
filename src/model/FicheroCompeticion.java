package model;

public class FicheroCompeticion{
    private String Nombre;

    public FicheroCompeticion(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}