
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexion {
    Connection con = null;

    private final String url = "jdbc:mysql://localhost:3306/proyecto" ;
    private final String user = "root";
    private final String password = "123456789";  // Corrected 'pasword' to 'password'
    
    public conexion() {
    }
    
    public Connection getConnection() {
        try {
            // Updated to the new MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            con = DriverManager.getConnection(url,user,password);
            System.out.println("¡Conexión establecida con éxito!");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver de MySQL no encontrado: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.getMessage());
        }
        return con;
    }

    public Connection getCon() {
        return con;
    }

    public void closeConnection() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
