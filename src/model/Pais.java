package model;

import java.util.List;

public class Pais {
    private String NombreIngles;
    private int NumeroHabitantes;
    private String Region;
    private String UrlBandera;
    private String [] Lengua;

    public Pais(String nombreIngles, int numeroHabitantes, String region, String urlBandera, String[] lengua) {
        NombreIngles = nombreIngles;
        NumeroHabitantes = numeroHabitantes;
        Region = region;
        UrlBandera = urlBandera;
        Lengua = lengua;
    }

    public String getNombreIngles() {
        return NombreIngles;
    }

    public void setNombreIngles(String nombreIngles) {
        NombreIngles = nombreIngles;
    }

    public int getNumeroHabitantes() {
        return NumeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        NumeroHabitantes = numeroHabitantes;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getUrlBandera() {
        return UrlBandera;
    }

    public void setUrlBandera(String urlBandera) {
        UrlBandera = urlBandera;
    }

    public String[] getLengua() {
        return Lengua;
    }

    public void setLengua(String[] lengua) {
        Lengua = lengua;
    }
}
