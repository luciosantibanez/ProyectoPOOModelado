import java.util.ArrayList;
import java.util.List;

public class Inventario{
    private ArrayList<Fruta> frutas;

    public Inventario(){
        frutas=new ArrayList<>();
    }

    public Inventario(ArrayList<Fruta> frutas) {
        this.frutas = frutas;
    }

    public void agregarFruta(Fruta fruta){
        frutas.add(fruta);
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "frutas=" + frutas +
                '}';
    }
}
