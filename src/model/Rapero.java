package model;

import java.util.Date;

public class Rapero {
    private String Nombre;
    private String Apellidos;
    private String NombreArtisitco;
    private Date FechaNacimiento;
    private int Nivel;
    private String UrlFoto;
    private String PaisOrigen;
    private int Puntuacion;

    public Rapero(String nombre, String apellidos, String nombreArtisitco, Date fechaNacimiento, int nivel, String urlFoto, String paisOrigen, int puntuacion) {
        Nombre = nombre;
        Apellidos = apellidos;
        NombreArtisitco = nombreArtisitco;
        FechaNacimiento = fechaNacimiento;
        Nivel = nivel;
        UrlFoto = urlFoto;
        PaisOrigen = paisOrigen;
        Puntuacion = puntuacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getNombreArtisitco() {
        return NombreArtisitco;
    }

    public void setNombreArtisitco(String nombreArtisitco) {
        NombreArtisitco = nombreArtisitco;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
}
