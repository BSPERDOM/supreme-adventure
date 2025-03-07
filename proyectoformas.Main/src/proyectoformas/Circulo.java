package proyectoformas;

public class Circulo {
    private String color;
    private double radio;

    public Circulo(String color, double radio) {
        this.color = color;
        this.radio = radio;
    }

    public void dibujar() {
        System.out.println("Dibujando un círculo de color " + color + " con radio " + radio);
    }
}