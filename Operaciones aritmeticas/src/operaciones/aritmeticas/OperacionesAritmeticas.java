package operaciones.aritmeticas;

import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número entero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número entero: ");
        int numero2 = scanner.nextInt();
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = (numero2 != 0) ? (numero1 / numero2) : 0;
        int modulo = (numero2 != 0) ? (numero1 % numero2) : 0;
        
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resta);
        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es: " + multiplicacion);
        if (numero2 != 0) {
            System.out.println("La división de " + numero1 + " entre " + numero2 + " es: " + division);
            System.out.println("El módulo de " + numero1 + " y " + numero2 + " es: " + modulo);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
        
        scanner.close();
    }
}