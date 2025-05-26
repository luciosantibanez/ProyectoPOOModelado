import java.util.ArrayList;

public class Mochila {
    private ArrayList<Item> items;

    public Mochila(){
        items=new ArrayList<>();
    }


    public void addItem(Item item){
        items.add(item);
    }

    public void displayMochila() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

}