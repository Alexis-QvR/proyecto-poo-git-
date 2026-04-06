package gestionproyectos;

public class Proyecto {
    private String nombreProyecto;

    public Proyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }


    public void calcularAvance() {
        System.out.println("Calculando el avance del proyecto...");
    }
}