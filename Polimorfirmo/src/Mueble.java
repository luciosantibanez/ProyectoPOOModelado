public class Mueble extends ElementoOficina {
    private String tipo;

    public Mueble(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    @Override
    public void mostrarElementos() {
        System.out.println("Mueble: " + getNombre() + ", Tipo: " + tipo);
    }
}
