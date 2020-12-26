package model;

public class Lengua {
    private String IdiomaIngles;
    private String IiomaNativoi;

    public Lengua(String idiomaIngles, String iiomaNativoi) {
        IdiomaIngles = idiomaIngles;
        IiomaNativoi = iiomaNativoi;
    }

    public String getIdiomaIngles() {
        return IdiomaIngles;
    }

    public void setIdiomaIngles(String idiomaIngles) {
        IdiomaIngles = idiomaIngles;
    }

    public String getIiomaNativoi() {
        return IiomaNativoi;
    }

    public void setIiomaNativoi(String iiomaNativoi) {
        IiomaNativoi = iiomaNativoi;
    }
}
