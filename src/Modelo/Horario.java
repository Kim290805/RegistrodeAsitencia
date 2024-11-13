
package Modelo;

import java.util.TimeZone;
import java.util.Calendar;

public class Horario {
    int idHorario;
    TimeZone horarioInicial;
    TimeZone horaFin;
    String diasTrabajo;
    int idEmpleado;

    public Horario() {
    }

    public Horario(int idHorario, TimeZone horarioInicial, TimeZone horaFin, String diasTrabajo, int idEmpleado) {
        this.idHorario = idHorario;
        this.horarioInicial = horarioInicial;
        this.horaFin = horaFin;
        this.diasTrabajo = diasTrabajo;
        this.idEmpleado = idEmpleado;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public TimeZone getHorarioInicial() {
        return horarioInicial;
    }

    public void setHorarioInicial(TimeZone horarioInicial) {
        this.horarioInicial = horarioInicial;
    }

    public TimeZone getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(TimeZone horaFin) {
        this.horaFin = horaFin;
    }

    public String getDiasTrabajo() {
        return diasTrabajo;
    }

    public void setDiasTrabajo(String diasTrabajo) {
        this.diasTrabajo = diasTrabajo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    public boolean verificarAsistencia(Empleado empleado){
         Calendar ahora = Calendar.getInstance();
        ahora.setTimeZone(horarioInicial);

        Calendar inicioHorario = Calendar.getInstance();
        inicioHorario.setTimeZone(horarioInicial);
        inicioHorario.set(Calendar.HOUR_OF_DAY, horarioInicial.getRawOffset() / (60 * 60 * 1000));
        inicioHorario.set(Calendar.MINUTE, 0);
        
        Calendar finHorario = Calendar.getInstance();
        finHorario.setTimeZone(horaFin);
        finHorario.set(Calendar.HOUR_OF_DAY, horaFin.getRawOffset() / (60 * 60 * 1000));
        finHorario.set(Calendar.MINUTE, 0);

        return ahora.after(inicioHorario) && ahora.before(finHorario);
            
    }
    
}
