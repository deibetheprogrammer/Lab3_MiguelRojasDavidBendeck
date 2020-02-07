package lab3_miguelrojasdavidbendeck;

public class Terapeuta extends Medico{
    private int num_terapias;

    public Terapeuta(int num_terapias, String colegio, String nombre, String apellido, int an_profesional, int salario) {
        super(colegio, nombre, apellido, an_profesional, salario);
        this.num_terapias = num_terapias;
    }


    public int getNum_terapias() {
        return num_terapias;
    }

    public void setNum_terapias(int num_terapias) {
        this.num_terapias = num_terapias;
    }

    @Override
    public String toString() {
        return "Terapeuta{" + "num_terapias=" + num_terapias + '}';
    }
    
}
