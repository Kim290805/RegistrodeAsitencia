
package Modelo;


public class Administrador extends Persona {
    int idAdmin;
    String email;
    String contraseña;
    Persona persona;

    public Administrador() {
    }

    public Administrador( String nombre, String apellido, String dni, int telefono ,int idAdmin, String email, String contraseña) {
        super(nombre, apellido, dni, telefono);
        this.idAdmin = idAdmin;
        this.email = email;
        this.contraseña = contraseña;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String Mostarinfo(){
        return "Id admin: "+idAdmin+"\n"+
                persona.MostrarInf()+"\n"+
                "email: "+email+"\n"+
                "contraseña: "+contraseña;
    }
    
}
