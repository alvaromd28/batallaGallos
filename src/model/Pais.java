package model;

import java.util.List;

public class Pais {
    private String NombreIngles;
    private int NumeroHabitantes;
    private String Region;
    private String UrlBandera;
    private List <String> Lengua;

    public Pais(String nombreIngles, int numeroHabitantes, String region, String urlBandera, List<String> lengua) {
        NombreIngles = nombreIngles;
        NumeroHabitantes = numeroHabitantes;
        Region = region;
        UrlBandera = urlBandera;
        Lengua = lengua;
    }
}
