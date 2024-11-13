
package Modelo;
import Modelo.Empleado;
import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    // Lista para almacenar empleados
    private List<Empleado> empleados = new ArrayList<>();

    // Lista para almacenar asistencias
    private List<Asistencia> asistencias = new ArrayList<>();

    public BaseDeDatos() {
        // Inicializa tus empleados (puedes hacerlo en un método aparte)
        inicializarEmpleados();
    }

    private void inicializarEmpleados() {
        // Agregar empleados de ejemplo
        empleados.add(new Empleado("Juan", "Pérez", "12345678", 987654321, 1, "Administrador", 3000.00));
        empleados.add(new Empleado("Ana", "Gómez", "23456789", 987654322, 2, "Almacenero", 1500.00));
        empleados.add(new Empleado("Luis", "Martínez", "34567890", 987654323, 3, "Almacenero", 1500.00));
        empleados.add(new Empleado("Marta", "Rodríguez", "45678901", 987654324, 4, "Recepcionista", 1800.00));
        empleados.add(new Empleado("José", "Hernández", "56789012", 987654325, 5, "Recepcionista", 1800.00));
        empleados.add(new Empleado("Sara", "López", "67890123", 987654326, 6, "Recepcionista", 1800.00));
    }
}
