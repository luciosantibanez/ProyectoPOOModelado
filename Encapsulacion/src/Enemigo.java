public class Enemigo {
    private String nombre;
    private int vida;

    public Enemigo(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public Enemigo() {
    }

    public void recibirDanio(int cantidad){
        if (vida<=0) {
            System.out.printf(nombre + " ya esta muerto, no puede recibir mas daño");
            return;
        }
        this.vida -= cantidad;
        if(this.vida< 0) this.vida = 0;
        System.out.println(nombre + " recibio " + cantidad +" daño. Vida restante " + vida);
        if (vida == 0) System.out.println(nombre + " murio");
    }

    public int getVida() {
        return vida;
    }

    public String getNombre(){
        return nombre;
    }

    public void mostrarInfo() {

        System.out.println("Enemigo: " + nombre + " Vida: " + vida);
    }
}


