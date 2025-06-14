public class Computadora extends ElementoOficina {
    private String SO;

    public Computadora(String nombre, String tipo) {
        super(nombre);
        this.SO = tipo;
    }

    @Override
    public void mostrarElementos() {
        System.out.println("Computadora: " + getNombre() + ", Tipo: " + SO);
    }
}
