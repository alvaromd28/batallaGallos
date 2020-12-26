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

    public Rapero(String nombre, String apellidos, String nombreArtisitco, Date fechaNacimiento, int nivel, String urlFoto, String paisOrigen) {
        Nombre = nombre;
        Apellidos = apellidos;
        NombreArtisitco = nombreArtisitco;
        FechaNacimiento = fechaNacimiento;
        Nivel = nivel;
        UrlFoto = urlFoto;
        PaisOrigen = paisOrigen;
    }
}
