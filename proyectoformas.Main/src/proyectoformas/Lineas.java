package proyectoformas;

public class Lineas extends Formas {
    private double largo;

    public Lineas(String color, double largo) {
        super(color);
        this.largo = largo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una línea.");
    }
}
