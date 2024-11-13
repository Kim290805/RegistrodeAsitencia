
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Justificacion {
    int IdJustificación;
    Date fechainicio,fechafin;
    String estado, motivo;
    List<ReporteAsistencia> reporte;
    List<Date> fechas;

    public Justificacion() {
    }

    public Justificacion(int IdJustificación, Date fechainicio, Date fechafin, String motivo, List<ReporteAsistencia> reporte, List<Date> fechas) {
        this.IdJustificación = IdJustificación;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.motivo = motivo;
        this.reporte = reporte;
        this.fechas = new ArrayList<>();
    }

    
    // Método para mostrar una justificación
    public void MJustificacion() {
        System.out.println("Justificación ID: " + IdJustificación);
        System.out.println("Motivo: " + motivo);
        System.out.println("Fechas: " + fechas);
        System.out.println("Estado: " + estado);
    }

    // Getter para 'motivo'
    public String getMotivo() {
        return motivo;
    }

    // Setter para 'motivo'
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    // Getter para 'fechas'
    public List<Date> getFechas() {
        return fechas;
    }

    // Setter para 'fechas' (rango de fechas)
    public void setFechas(Date fechainicio, Date fechafin) {
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;

        // Limpiar la lista de fechas y agregar el rango de fechas
        this.fechas.clear();
        this.fechas.add(fechainicio);
        this.fechas.add(fechafin);
    }
    
}
