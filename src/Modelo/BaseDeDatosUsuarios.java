
package Modelo;
import java.util.HashMap;

public class BaseDeDatosUsuarios {
    
    // Simulamos una base de datos con un HashMap
    private HashMap<String, String> usuarios;

    public BaseDeDatosUsuarios() {
        usuarios = new HashMap<>();
        // Agregar algunos usuarios predefinidos (usuario, contraseña)
        usuarios.put("admin", "admin123");
        usuarios.put("user", "password");
    }

    // Método para verificar si el usuario y la contraseña existen en la "base de datos"
    public LoginUsuari login(String usuario, String contrasena) {
        if (usuarios.containsKey(usuario)) {
            String pass = usuarios.get(usuario);
            if (pass.equals(contrasena)) {
                // Si el login es exitoso, se devuelve un objeto de LoginUsuari
                return new LoginUsuari(usuario, contrasena);
            }
        }
        return null; // Si no es válido, se devuelve null
    }
}
