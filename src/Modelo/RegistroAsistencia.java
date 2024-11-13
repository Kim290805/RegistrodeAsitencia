
package Modelo;

import java.util.Date;

public class RegistroAsistencia {
    int idRegistro;
    Date fecha;
    Date horaEntrada;
    Date horaSalida;
    double totalHoras;
    Empleado empleado;

    public RegistroAsistencia() {
    }

    public RegistroAsistencia(int idRegistro, Date fecha, Date horaEntrada, Date horaSalida, double totalHoras, Empleado empleado) {
        this.idRegistro = idRegistro;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.totalHoras = totalHoras;
        this.empleado = empleado;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public double getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(double totalHoras) {
        this.totalHoras = totalHoras;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    
    public void registrarEntrada(Empleado empleado) {
        this.horaEntrada = new Date(); 
        System.out.println("Entrada registrada para " + empleado.getNombre()+ " a las " + horaEntrada);
    }

    // Method to register employee exit time
    public void registrarSalida(Empleado empleado) {
        this.horaSalida = new Date(); 
        System.out.println("Salida registrada para " + empleado.getNombre() + " a las " + horaSalida);
    }
    public double calcularHorasDiarias() {
        if (horaEntrada != null && horaSalida != null) {
            long diffInMillis = horaSalida.getTime() - horaEntrada.getTime();
            double hoursWorked = (double) diffInMillis / (1000 * 60 ); // 1 horas = 3600 seg = 3600 
            
            System.out.println("Horas trabajadas en el día: " + hoursWorked);
            return hoursWorked;
        } else {
            System.out.println("Entrada o salida no registrada.");
            return 0.0;
        }
    }
}
