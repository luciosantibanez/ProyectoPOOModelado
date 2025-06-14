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
    public void mostrarElementos() {
        System.out.println("Empleado: " + getNombre() + ", Puesto: " + puesto);
    }
}
