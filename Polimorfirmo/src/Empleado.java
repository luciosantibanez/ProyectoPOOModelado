public class Empleado extends ElementoOficina{
    private String puesto;

    public Empleado(String nombre, String puesto) {
        super(nombre);
        this.puesto = puesto;
    }

    public Empleado(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado: " + getNombre() + ", Puesto: " + puesto;
    }
}
