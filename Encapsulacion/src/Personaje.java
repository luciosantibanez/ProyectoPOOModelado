public class Personaje {
    private String nombre;
    private int vida;
    private String arma;
    private int danio;

    public Personaje(String nombre, int vida, String arma, int danio) {
        this.nombre = nombre;
        this.vida = vida;
        this.arma = arma;
        this.danio = danio;
    }

    public void golpear(Enemigo enemigo) {
        System.out.println(nombre + " ataca con " + arma + " causando " + danio + " de daño.");
        enemigo.recibirDanio(danio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }
}
