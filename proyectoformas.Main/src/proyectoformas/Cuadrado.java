package proyectoformas;

public class Cuadrado extends Formas {
    private double area;

    public Cuadrado(String color, double area) {
        super(color);
        this.area = area;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado.");
    }
}
