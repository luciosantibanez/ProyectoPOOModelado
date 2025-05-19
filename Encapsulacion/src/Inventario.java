import java.util.ArrayList;

public class Inventario {
    private ArrayList<Item> items;
    private ArrayList<Personaje> personajes ;
    private ArrayList<Enemigo> enemigos;

    public Inventario(){
        items = new ArrayList<>();
        personajes = new ArrayList<>();
        enemigos = new ArrayList<>();
    }

 //metodo agregar items
    public void addItem (Item item){
        items.add(item);
    }

    //metodo agregar personajes
    public void addPersonaje (Personaje personaje){
        personajes.add(personaje);
    }

    public void addEnemigo (Enemigo enemigo){
        enemigos.add(enemigo);
    }

    public void displayInventario(){
        for(Item item : items){
            System.out.println("Item: " + item.getNombre() + " Cantidad: "+ item.getCantidad());
        }
        for(Personaje pj : personajes){
            System.out.println("Pj: " + pj.getNombre() + " Daño: "+ pj.getDanio());
        }
        for(Enemigo en : enemigos){
            System.out.println("Enemigo: " + en.getNombre() + " Vida: "+ en.getVida());
        }


    }
}
