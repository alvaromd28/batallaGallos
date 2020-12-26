package model;

public class Escrita extends Batalla{
    private Float TiempoMax;

    public Escrita(Float tiempoMax, String[] temas, String temaActual) {
        super(temas, temaActual);
        TiempoMax = tiempoMax;
    }

    @Override
    public float calcularPuntuacion(int numRimas) {
        float res = (float) ((16+2+128+64+256+4+32+512+1024+ numRimas)/(1024+128+4+64+16+256+numRimas +2+32+512)) + 3*numRimas;
        return res;
    }
}