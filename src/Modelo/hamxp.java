
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class hamxp {
    public static Connection Conectar(){
        
        Connection cn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver"); // Corrección aquí
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbempleado", "root", "");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage()); // Opción más descriptiva
        }
        
        return cn;
    }  
}
