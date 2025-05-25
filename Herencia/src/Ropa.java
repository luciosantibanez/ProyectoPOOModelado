public class Ropa extends Item{

    private int disparo;
    private String tipo;

    public Ropa() {
    }

    public Ropa(int disparo, String tipo) {
        this.disparo = disparo;
        this.tipo = tipo;
    }

    public Ropa(String nombre, int cantidad, int disparo, String tipo) {
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
