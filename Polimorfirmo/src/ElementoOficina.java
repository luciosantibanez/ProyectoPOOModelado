public  class ElementoOficina {
    private String nombre;

    public void mostrarElementos(){
        System.out.println("Elemento genérico: " + nombre);
    }

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

}
