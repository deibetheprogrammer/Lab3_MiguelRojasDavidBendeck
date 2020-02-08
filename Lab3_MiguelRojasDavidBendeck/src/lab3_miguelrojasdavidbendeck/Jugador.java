package lab3_miguelrojasdavidbendeck;

public class Jugador  extends Persona{
    private int numero;
    private int tiro_3;
    private int defensa;
    private int tiro_media;
    private int rebote;
    private int bandeja;
    private int pases;
    private int posteo;
    private Double altura;

    
    public Jugador(int numero, int tiro_3, int defensa, int tiro_media, int rebote, int bandeja, int pases, int posteo, Double altura, String nombre, String apellido, int an_profesional, int salario) {
        super(nombre, apellido, an_profesional, salario);
        this.numero = numero;
        this.tiro_3 = tiro_3;
        this.defensa = defensa;
        this.tiro_media = tiro_media;
        this.rebote = rebote;
        this.bandeja = bandeja;
        this.pases = pases;
        this.posteo = posteo;
        this.altura = altura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTiro_3() {
        return tiro_3;
    }

    public void setTiro_3(int tiro_3) {
        this.tiro_3 = tiro_3;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getTiro_media() {
        return tiro_media;
    }

    public void setTiro_media(int tiro_media) {
        this.tiro_media = tiro_media;
    }

    public int getRebote() {
        return rebote;
    }

    public void setRebote(int rebote) {
        this.rebote = rebote;
    }

    public int getBandeja() {
        return bandeja;
    }

    public void setBandeja(int bandeja) {
        this.bandeja = bandeja;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getPosteo() {
        return posteo;
    }

    public void setPosteo(int posteo) {
        this.posteo = posteo;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Numero de Camiseta = " + numero + ", Tiro de 3 = " + tiro_3 + ", Defensa = " + defensa + ", Tiro de Media = " 
                + tiro_media + ", Rebote = " + rebote + ", Bandeja = " + bandeja 
                + ", Pases = " + pases + ", Posteo = " + posteo + ", Altura = " + altura + '}';
    }

    
    
}
