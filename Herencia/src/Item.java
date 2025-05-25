public class Item {
    private String nombre;
    private String color;

    public Item() {
    }

    public Item(String nombre, String color) {
        this.nombre = nombre;
        this.color= color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor(){
        return color;
    }
}
