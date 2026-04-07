package gestionproyectos;

public class Arquero extends Tarea {
    private int flechas;

    public Arquero(String nombre, int flechas) {
        super(nombre);
        this.flechas = flechas;
    }

    public void dispararFlecha() {
        if (flechas > 0) {
            flechas--;
            System.out.println(getNombre() + " disparó. Flechas restantes: " + flechas);
        } else {
            System.out.println(getNombre() + " no tiene flechas.");
        }
    }
}
