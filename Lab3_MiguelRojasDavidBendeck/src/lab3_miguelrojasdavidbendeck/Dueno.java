package lab3_miguelrojasdavidbendeck;


public class Dueno extends Persona{
    
    private int networth;
    private String ciudad_nac;

    public Dueno(int networth, String ciudad_nac, String nombre, String apellido, int an_profesional, int salario) {
        super(nombre, apellido, an_profesional, salario);
        this.networth = networth;
        this.ciudad_nac = ciudad_nac;
    }

    public int getNetworth() {
        return networth;
    }

    public void setNetworth(int networth) {
        this.networth = networth;
    }

    public String getCiudad_nac() {
        return ciudad_nac;
    }

    public void setCiudad_nac(String ciudad_nac) {
        this.ciudad_nac = ciudad_nac;
    }

    @Override
    public String toString() {
        return "Dueno{" + "networth=" + networth + ", ciudad_nac=" + ciudad_nac + '}';
    }
    
}
