
package Modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

public class Empleado extends Persona{
    int idEmpleado;
    String puesto;
    double salario;
    Persona persona;
    
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String dni, int telefono, int idEmpleado, String puesto, double salario) {
        super( nombre, apellido, dni, telefono);
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    public void registrarEntrada(){
        horaEntrada = LocalDateTime.now();
        System.out.println("Hora de entrada registrada: " + horaEntrada);
    }
    public void registrarSalida(){
        horaSalida = LocalDateTime.now();
        System.out.println("Hora de salida registrada: " + horaSalida);
    }
    public double calcularHorasTrabajadas(){
         if (horaEntrada != null && horaSalida != null) {
            Duration duracion = Duration.between(horaEntrada, horaSalida);
            long horas = duracion.toHours();
            System.out.println("Horas trabajadas: " + horas);
            return horas;
        } else {
            System.out.println("Debe registrar tanto la entrada como la salida.");
            return 0;
        }
    }
    
    public String mostrarInfo(){
        return "idEmpleado"+idEmpleado+"\n"+
                persona.MostrarInf()+"\n"+
                "Sueldo "+salario+"\n"+
                "puesto "+puesto;
    }
}
