public class Ropa extends Item{

    private String tipo;

    public Ropa() {
    }

    public Ropa(String tipo) {
        this.tipo = tipo;
    }

    public Ropa(String nombre, String color, String tipo) {
        super(nombre, color);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Item " + getNombre() + ", color " + getColor() + ", tipo " + tipo;
    }
}
