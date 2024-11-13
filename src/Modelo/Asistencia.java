
package Modelo;

import java.time.LocalDateTime;

public class Asistencia {
    private String nombre;
    private String tipoAsistencia; // "Ingreso" o "Salida"
    private LocalDateTime hora;

    public Asistencia(String nombre, String tipoAsistencia, LocalDateTime hora) {
        this.nombre = nombre;
        this.tipoAsistencia = tipoAsistencia;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoAsistencia() {
        return tipoAsistencia;
    }

    public LocalDateTime getHora() {
        return hora;
   }
}
