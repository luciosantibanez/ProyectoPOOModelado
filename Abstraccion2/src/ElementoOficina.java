public abstract class ElementoOficina {
    private String nombre;



    public ElementoOficina() {
    }

    public ElementoOficina(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void mostrarElementos();
}
