import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Mochila mochila = new Mochila();

        Juguete muñeco = new Juguete("Payaso", "verde", "Coleccionable");
        Ropa gorra = new Ropa("accesorio");
        Ropa gorro = new Ropa("gorro", "negro","accesorio");
        Item itemGenerico = new Item("Notebook","gris");

        mochila.addItem(muñeco);
        mochila.addItem(gorra);
        mochila.addItem(gorro);
        mochila.addItem(itemGenerico);

        mochila.displayMochila();






    }
}
