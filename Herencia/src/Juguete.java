public class Juguete extends Item{
    private String tipo;


    public Juguete(String nombre, int cantidad, String tipo) {
        super(nombre, cantidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}