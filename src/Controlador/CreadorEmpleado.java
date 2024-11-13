
package Controlador;
// a las 9 go con esto go diseño xd
// Realizar fast para administar los empelado uso del crud, con la conexion 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modelo.Empleado;
import Modelo.conexion;


public class CreadorEmpleado {
    
    conexion conexionDB = new conexion();
    
     public boolean crearEmpleado(Empleado empleado) {
        String sql = "INSERT INTO empleados (nombre, apellido, cargo, salario) VALUES (?, ?, ?, ?)";
        
        try (Connection con = conexionDB.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {
             
            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getApellido());
            stmt.setString(3, empleado.getPuesto());
            stmt.setDouble(4, empleado.getSalario());
            
            int filasInsertadas = stmt.executeUpdate();
            return filasInsertadas > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para leer todos los empleados de la base de datos
    public List<Empleado> leerEmpleados() {
        List<Empleado> listaEmpleados = new ArrayList<>();
        String sql = "SELECT * FROM empleados";
        
        try (Connection con = conexionDB.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
             
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setIdEmpleado(rs.getInt("id"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setPuesto(rs.getString("cargo"));
                empleado.setSalario(rs.getDouble("salario"));
                listaEmpleados.add(empleado);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return listaEmpleados;
    }

    // Método para actualizar un empleado en la base de datos
    public boolean actualizarEmpleado(Empleado empleado) {
        String sql = "UPDATE empleados SET nombre = ?, apellido = ?, cargo = ?, salario = ? WHERE id = ?";
        
      try (Connection con = conexionDB.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getApellido());
            stmt.setString(3, empleado.getPuesto());
            stmt.setDouble(4, empleado.getSalario());
            stmt.setInt(5, empleado.getIdEmpleado());
            
            int filasActualizadas = stmt.executeUpdate();
            return filasActualizadas > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para eliminar un empleado de la base de datos
    public boolean eliminarEmpleado(int id) {
        String sql = "DELETE FROM empleados WHERE id = ?";
        
        try (Connection con = conexionDB.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {
             
            stmt.setInt(1, id);
            int filasEliminadas = stmt.executeUpdate();
            return filasEliminadas > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
