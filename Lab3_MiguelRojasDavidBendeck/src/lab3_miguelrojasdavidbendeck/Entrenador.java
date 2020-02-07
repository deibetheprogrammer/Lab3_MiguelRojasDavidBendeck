package lab3_miguelrojasdavidbendeck;


public class Entrenador extends Persona{
    
    private boolean played;
    private String jugada_fav;

    public Entrenador(boolean played, String jugada_fav, int salario, String nombre, String apellido, int an_profesional) {
        super(nombre, apellido, an_profesional, salario);
        this.played = played;
        this.jugada_fav = jugada_fav;
    }

    public boolean isPlayed() {
        return played;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }

    public String getJugada_fav() {
        return jugada_fav;
    }

    public void setJugada_fav(String jugada_fav) {
        this.jugada_fav = jugada_fav;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "played=" + played + ", jugada_fav=" + jugada_fav + '}';
    }
}
