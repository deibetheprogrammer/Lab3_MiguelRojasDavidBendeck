package lab3_miguelrojasdavidbendeck;

public class MedicoGeneral extends Medico{
    private int num_enfermedades;

    public MedicoGeneral(int num_enfermedades, String colegio, String nombre, String apellido, int an_profesional, int salario) {
        super(colegio, nombre, apellido, an_profesional, salario);
        this.num_enfermedades = num_enfermedades;
    }

    public int getNum_enfermedades() {
        return num_enfermedades;
    }

    public void setNum_enfermedades(int num_enfermedades) {
        this.num_enfermedades = num_enfermedades;
    }

    @Override
    public String toString() {
        return "MedicoGeneral{" + "Numero de Enfermedades = " + num_enfermedades + '}';
    }
    
    
}
