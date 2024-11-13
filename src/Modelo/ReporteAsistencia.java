
package Modelo;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

public class ReporteAsistencia {
    int idReporte;
    Date fechaInicio;
    Date fechaFin;
    List<RegistroAsistencia> registros;

    public ReporteAsistencia() {
    }

    public ReporteAsistencia(int idReporte, Date fechaInicio, Date fechaFin) {
        this.idReporte = idReporte;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.registros = registros;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<RegistroAsistencia> getRegistros() {
        return registros;
    }

    public void setRegistros(List<RegistroAsistencia> registros) {
        this.registros = registros;
    }

    public String generarReporte(Empleado empleado, Date fechaInicio, Date fechaFin) {
        StringBuilder reporte = new StringBuilder();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

        // Encabezado del reporte
        reporte.append("Reporte de Asistencia\n");
        reporte.append("Empleado: ").append(empleado.getNombre()).append("\n");
        reporte.append("Periodo: ").append(formatoFecha.format(fechaInicio)).append(" a ").append(formatoFecha.format(fechaFin)).append("\n");
        reporte.append("-------------------------------------------------\n");
        reporte.append(String.format("%-15s %-20s %-20s\n", "Fecha", "Hora de Entrada", "Hora de Salida"));

        for (RegistroAsistencia registro : registros) {
            Date fechaRegistro = registro.getFecha();
            if (fechaRegistro.after(fechaInicio) && fechaRegistro.before(fechaFin)) {
                String fecha = formatoFecha.format(fechaRegistro);
                String horaEntrada = registro.getHoraEntrada() != null ? registro.getHoraEntrada().toString() : "No registrado";
                String horaSalida = registro.getHoraSalida() != null ? registro.getHoraSalida().toString() : "No registrado";

                reporte.append(String.format("%-15s %-20s %-20s\n", fecha, horaEntrada, horaSalida));
            }
        }

        // Si no se encontraron registros
        if (reporte.length() == 0) {
            reporte.append("No se encontraron registros de asistencia para el periodo especificado.\n");
        }

        return reporte.toString();
    }
    
}
