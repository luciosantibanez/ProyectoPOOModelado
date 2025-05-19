import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Personaje heroe = new Personaje("Heroe", 180, "espada", 20);
        Enemigo zombie = new Enemigo("Zombie", 50);
        Personaje guerrero = new Personaje("Guerrero", 220,"lanza", 30);

        Inventario inventarioDePersonajes = new Inventario();
        Inventario inventarioEnemigo = new Inventario();

        inventarioEnemigo.addEnemigo(zombie);
        inventarioDePersonajes.addPersonaje(heroe);
        inventarioDePersonajes.addPersonaje(guerrero);


        inventarioDePersonajes.displayInventario();
        inventarioEnemigo.displayInventario();

        System.out.println("Cuantas veces el personaje golpea al enemigo? ");
        int golpes = scanner.nextInt();

        for (int i = 1; i <= golpes; i++) {
            System.out.println("Golpe #" + i);
            heroe.golpear(zombie);

            if (zombie.getVida() <= 0) {
                break;
            }
        }

        if (zombie.getVida() > 0) {
            System.out.println(zombie.getNombre() + " sobrevivió con " + zombie.getVida() + " de vida.");
        }


    }
}
