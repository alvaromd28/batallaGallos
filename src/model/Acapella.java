package model;

public class Acapella extends Batalla{
    private String Tema;

    public Acapella(String tema, String[] temas, String temaActual) {
        super(temas, temaActual);
        Tema = tema;
    }

    @Override
    public float calcularPuntuacion(int numRimas) {
        float res = (float) ((6 * Math.sqrt(numRimas) + 3)/2);
        return res;
    }
}