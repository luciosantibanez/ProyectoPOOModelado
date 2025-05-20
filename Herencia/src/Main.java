import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fruta pera = new Fruta("pera",2,"verde");

        Inventario inventario = new Inventario();

        Item item1=new Item("Item generico",10);

        Fruta fruta1=new Fruta("Manzana",4,"Dulce");

        inventario.agregarFruta(pera);
        System.out.println(pera);






    }
}
