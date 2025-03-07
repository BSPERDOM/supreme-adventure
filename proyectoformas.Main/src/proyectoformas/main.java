package proyectoformas.main;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las formas
        Circulo circulo = new Circulo("Rojo", 5.0);
        Lineas linea = new Lineas("Azul", 10.0);
        Triangulo triangulo = new Triangulo("Verde", 45.0);
        Cuadrado cuadrado = new Cuadrado("Amarillo", 4.0);

        // Llamar a los métodos de dibujar
        circulo.dibujar();
        linea.dibujar();
        triangulo.dibujar();
        cuadrado.dibujar();
    }
}
