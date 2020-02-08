package lab3_miguelrojasdavidbendeck;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int an_profesional;
    private int salario;

    public Persona(String nombre, String apellido, int an_profesional, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.an_profesional = an_profesional;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAn_profesional() {
        return an_profesional;
    }

    public void setAn_profesional(int an_profesional) {
        this.an_profesional = an_profesional;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre = " + nombre + ", Apellido = " + apellido + ", Anios de Profesional = " + an_profesional + ", Salario = " + salario + '}';
    }  
}
