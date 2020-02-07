package lab3_miguelrojasdavidbendeck;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private int anio_fundacion;
    private int campeonatos;
    
    ArrayList<Jugador> jug = new ArrayList();
    ArrayList<Medico> med = new ArrayList();
    ArrayList<Jugadas> plays = new ArrayList();
    ArrayList<Preparador_Fisico> prep_f = new ArrayList();
    Entrenador_Principal ent_p = new Entrenador_Principal(true, nombre, campeonatos, nombre, nombre, anio_fundacion);
    Asistente_Entrenador asist_e = new Asistente_Entrenador(true, nombre, campeonatos, nombre, nombre, anio_fundacion);
    Dueno dueno = new Dueno(campeonatos, nombre, nombre, nombre, anio_fundacion, campeonatos);

    public Equipo() {
        
    }


    public Equipo(String nombre, int anio_fundacion, int campeonatos) {
        this.nombre = nombre;
        this.anio_fundacion = anio_fundacion;
        this.campeonatos = campeonatos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio_fundacion() {
        return anio_fundacion;
    }

    public void setAnio_fundacion(int anio_fundacion) {
        this.anio_fundacion = anio_fundacion;
    }

    public int getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }

    public ArrayList<Jugador> getJug() {
        return jug;
    }

    public void setJug(ArrayList<Jugador> jug) {
        this.jug = jug;
    }

    public ArrayList<Medico> getMed() {
        return med;
    }

    public void setMed(ArrayList<Medico> med) {
        this.med = med;
    }

    public ArrayList<Jugadas> getPlays() {
        return plays;
    }

    public void setPlays(ArrayList<Jugadas> plays) {
        this.plays = plays;
    }

    public ArrayList<Preparador_Fisico> getPrep_f() {
        return prep_f;
    }

    public void setPrep_f(ArrayList<Preparador_Fisico> prep_f) {
        this.prep_f = prep_f;
    }

    public Entrenador_Principal getEnt_p() {
        return ent_p;
    }

    public void setEnt_p(Entrenador_Principal ent_p) {
        this.ent_p = ent_p;
    }

    public Asistente_Entrenador getAsist_e() {
        return asist_e;
    }

    public void setAsist_e(Asistente_Entrenador asist_e) {
        this.asist_e = asist_e;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", anio_fundacion=" + anio_fundacion + ", campeonatos=" + campeonatos + ", jug=" + jug + ", med=" + med + ", plays=" + plays + ", prep_f=" + prep_f + ", ent_p=" + ent_p + ", asist_e=" + asist_e + ", dueno=" + dueno + '}';
    }
    
    
}
