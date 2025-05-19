public class Arma extends Item{

    private int disparo;
    private String tipo;

    //CONSTRUCTORES
    public Arma() {
    }

    public Arma(int disparo, String tipo) {
        this.disparo = disparo;
        this.tipo = tipo;
    }

    public Arma(String nombre, int cantidad, int disparo, String tipo) {
        super(nombre, cantidad);
        this.disparo = disparo;
        this.tipo = tipo;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setDisparo(int disparo) {
        this.disparo = disparo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
