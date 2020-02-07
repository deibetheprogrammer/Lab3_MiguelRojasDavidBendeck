
package lab3_miguelrojasdavidbendeck;


public class Medico extends Persona{
    
    private String colegio;

    public Medico(String colegio, String nombre, String apellido, int an_profesional, int salario) {
        super(nombre, apellido, an_profesional, salario);
        this.colegio = colegio;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    @Override
    public String toString() {
        return "Medico{" + "colegio=" + colegio + '}';
    }
    
    
}
