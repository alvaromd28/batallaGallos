package model;

public abstract class Batalla {
    private String[] tema;
    private String temaActual;

    public Batalla(String[] tema, String temaActual) {
        tema = tema;
        temaActual = temaActual;
    }

    public String[] getTema() {
        return tema;
    }

    public void setTema(String[] tema) {
        tema = tema;
    }

    public String getTemaActual() {
        return temaActual;
    }

    public void setTemaActual(String temaActual) {
        this.temaActual = temaActual;
    }

    public void actualizarPuntuacionRaperos (Rapero[] listsRaperos) {
    }

    public abstract float calcularPuntuacion(int numRimas);

    public void elegirTema () {
        int numero = (int) (Math.random() * tema.length -1);
        temaActual = tema[numero];
    }
}
