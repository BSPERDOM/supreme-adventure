package arreglomultidimensional;

public class ArregloMultidimensional {
    public static void main(String[] args) {
        String[][] datosPersonales = {
            {"Daniel", "Medina", "Electronica", "TEST"},
            {"Monica", "Jiz", "Computacion", "IMSA"},
            {"Pedro", "Lopez", "Mecanica", "ABC"},
            {"Ana", "Perez", "Civil", "XYZ"},
            {"Luis", "Gomez", "Industrial", "DEF"}
        };
        
        for (String[] persona : datosPersonales) {
            System.out.println(persona[0] + "\t" + persona[1] + "\t" + persona[2] + "\t" + persona[3]);
        }
    }
}