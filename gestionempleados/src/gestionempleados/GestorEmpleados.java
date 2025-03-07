import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados {
    // Lista de empleados
    private List<Empleado> empleados;

    // Constructor
    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    // Método para agregar un empleado
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado correctamente.");
    }

    // Método para mostrar todos los empleados
    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado empleado : empleados) {
                empleado.mostrarInformacion();
            }
        }
    }
}