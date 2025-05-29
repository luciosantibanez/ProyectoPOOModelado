import java.util.ArrayList;

public class Oficina {

    private ArrayList<ElementoOficina> elementos;


    public Oficina() {
        elementos=new ArrayList<>();
    }

    public void agregarElemento(ElementoOficina elemento) {
        elementos.add(elemento);
    }

    public void mostrarTodo() {
        System.out.println("Contenido de la oficina:");
        for (ElementoOficina e : elementos) {
            e.mostrarElementos();
        }

    }
}
