public class Computadora extends ElementoOficina {
    private String SO;

    public Computadora(String nombre, String tipo) {
        super(nombre);
        this.SO = tipo;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + ", Tipo: " + SO;
    }
}
