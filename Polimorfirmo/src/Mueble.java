public class Mueble extends ElementoOficina {
    private String tipo;

    public Mueble(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mueble: " + getNombre() + ", Tipo: " + tipo;
    }
}
