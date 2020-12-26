package model;

public class Sangre extends Batalla{
    private String ProductorBase;

    public Sangre (String productorBase, String[] temas, String temaActual) {
        super(temas,temaActual);
        ProductorBase = productorBase;
    }

    @Override
    public float calcularPuntuacion(int numRimas) {
        float res = (float) ((Math.PI * Math.pow(numRimas, 2))/4);
        return res;
    }

}