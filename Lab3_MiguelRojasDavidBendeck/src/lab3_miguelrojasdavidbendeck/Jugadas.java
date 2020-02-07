package lab3_miguelrojasdavidbendeck;

public class Jugadas {
    private String descripcion;
    private int efectividad;

    public Jugadas(String descripcion, int efectividad) {
        this.descripcion = descripcion;
        this.efectividad = efectividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEfectividad() {
        return efectividad;
    }

    public void setEfectividad(int efectividad) {
        this.efectividad = efectividad;
    }

    @Override
    public String toString() {
        return "Jugadas{" + "descripcion=" + descripcion + ", efectividad=" + efectividad + '}';
    }
    
    
}
