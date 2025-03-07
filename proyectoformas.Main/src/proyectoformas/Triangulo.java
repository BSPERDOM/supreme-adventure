package proyectoformas;

public class Triangulo extends Formas {
    private double angulo;

    public Triangulo(String color, double angulo) {
        super(color);
        this.angulo = angulo;
    }

    public void calcularArea() {
        System.out.println("Calculando el área del triángulo.");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo.");
    }
}