
package Controlador;
import Modelo.conexion;
import Modelo.conexion;
import java.sql.Connection;

public class Main {

    
    public static void main(String[] args) {
       
        // Llamar al método conectar para comprobar la conexión
        conexion conexion = new conexion();

        // Verificar si la conexión es exitosa
        if (conexion.getCon() != null) {
            System.out.println("Conexión establecida correctamente.");
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }

        // Cerrar la conexión
        conexion.closeConnection();
    }
    
}
