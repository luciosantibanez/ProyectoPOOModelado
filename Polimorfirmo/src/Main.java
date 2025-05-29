import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Oficina oficina = new Oficina();

    Empleado empleado1 = new Empleado("Lucio","Programador");
    Mueble mueble1 = new Mueble("Escritorio", "Ejecutivo");
    Computadora pc1 = new Computadora("HP", "Windows 11");



    oficina.agregarElemento(empleado1);
    oficina.agregarElemento(mueble1);
    oficina.agregarElemento(pc1);

    oficina.mostrarTodo();

    }
}
