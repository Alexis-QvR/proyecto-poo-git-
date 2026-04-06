package gestionproyectos;
public class Mago extends Tarea {
    private int mana;

    public Mago(String nombre, int mana) {
        super(nombre);
        this.mana = mana;
    }
    public void lanzarHechizo() {
        System.out.println(getNombre() + " está lanzando un hechizo...");
    }
}