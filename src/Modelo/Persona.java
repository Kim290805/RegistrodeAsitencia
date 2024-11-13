package Modelo;


public class Persona {
    String nombre, apellido, dni;
    int telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, int telefono ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    public String MostrarInf(){
        return "Nombre: "+nombre+" "+apellido+"\n"+
                "dni: "+dni+"\n"+
                "telefono: "+telefono;
    }
}
