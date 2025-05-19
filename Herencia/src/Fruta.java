public class Fruta extends Item{
    private String tipo;


    public Fruta(String nombre, int cantidad, String tipo) {
        super(nombre, cantidad);
        this.tipo = tipo;
    }
}
