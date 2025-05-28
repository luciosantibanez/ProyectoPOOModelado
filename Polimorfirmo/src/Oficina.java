import java.util.ArrayList;

public class Oficina {

    private ArrayList<ElementoOficina> muebles;


    public Oficina() {
        muebles=new ArrayList<>();
    }

    public void addItem(ElementoOficina mueble){
        muebles.add(mueble);
    }

    public void displayCasa() {
        for (ElementoOficina mueble : muebles) {
            System.out.println(mueble.toString());
        }


    }
}
