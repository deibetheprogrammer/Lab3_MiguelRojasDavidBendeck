package lab3_miguelrojasdavidbendeck;

public class Cirujano extends Medico{
    private int num_cirugias;

    public Cirujano(int num_cirugias, String colegio, String nombre, String apellido, int an_profesional, int salario) {
        super(colegio, nombre, apellido, an_profesional, salario);
        this.num_cirugias = num_cirugias;
    }

    public int getNum_cirugias() {
        return num_cirugias;
    }

    public void setNum_cirugias(int num_cirugias) {
        this.num_cirugias = num_cirugias;
    }

    @Override
    public String toString() {
        return "Cirujano{" + "num_cirugias=" + num_cirugias + '}';
    }
    
    
}
