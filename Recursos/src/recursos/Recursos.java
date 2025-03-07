public class Recursos {

    // Primer método: Retornar un mensaje
    public String mensajePOO() {
        return "Programación Orientada a Objetos 2021";
    }

    // Segundo método: Verificar si es mayor o menor de edad
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer método: Multiplicación de dos enteros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Cuarto método: Retornar una lista de números del 1 al X
    public String listaNumeros(int x) {
        StringBuilder lista = new StringBuilder();
        for (int i = 1; i <= x; i++) {
            lista.append(i).append(" ");
        }
        return lista.toString().trim(); // Elimina el espacio final
    }
}