public class Item {
    private String nombre;
    private int cantidad;

    public Item() {
    }

    public Item(String nombre, int cantidad) {
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad(){
        return cantidad;
    }
}
