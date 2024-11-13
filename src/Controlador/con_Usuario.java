
package Controlador;

import Modelo.LoginUsuari;
import Modelo.conexion;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;



 /*


public class con_Usuario {
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public LoginUsuari login(String user, String pass) {
        LoginUsuari us = new LoginUsuari();
        String sql = "SELECT * FROM usuario WHERE Usuario = ? AND password = ?";
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);  
            ps.setString(2, pass);  
            rs = ps.executeQuery();

            if (rs.next()) {
                us.setId_Usuario(rs.getInt("id_usuario"));
                us.setNombre(rs.getString("nombre"));
                us.setUsuario(rs.getString("Usuario"));
                us.setContraseña(rs.getString("password"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error durante el login: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return us;
    }
}
*/