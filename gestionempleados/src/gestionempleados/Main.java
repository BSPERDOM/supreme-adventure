public class Main {
    public static void main(String[] args) {
        // Crear una instancia de GestorEmpleados
        GestorEmpleados gestor = new GestorEmpleados();

        // Crear algunos empleados
        Empleado empleado1 = new Empleado("Juan Pérez", 30, 2500.0);
        Empleado empleado2 = new Empleado("María López", 25, 3000.0);
        Empleado empleado3 = new Empleado("Carlos Gómez", 40, 4000.0);

        // Agregar empleados al gestor
        gestor.agregarEmpleado(empleado1);
        gestor.agregarEmpleado(empleado2);
        gestor.agregarEmpleado(empleado3);

        // Mostrar la lista de empleados
        gestor.mostrarEmpleados();
    }
}