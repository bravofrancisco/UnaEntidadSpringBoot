package com.franciscob.demo_proyectoSolicitudVacaciones.Models;

import com.franciscob.demo_proyectoSolicitudVacaciones.Models.Enum.EstadoSolicitud;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "solicitud_vacaciones")
public class SolicitudVacaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Asegura que el nombre del empleado no sea nulo y no contenga solo espacios en blanco.
    @NotBlank(message = "El nombre del empleado no puede estar en blanco.")
    @Column(name = "nombreEmpleado", length = 255, nullable = false)
    private String nombreEmpleado;

    // Asegura que la fecha de inicio no sea nula.
    // Además, que la fecha sea en el presente o en el futuro.
    @NotNull(message = "La fecha de inicio no puede ser nula.")
    @FutureOrPresent(message = "La fecha de inicio debe ser en el presente o en el futuro.")
    private LocalDate fechaInicio;

    // Asegura que la fecha de fin no sea nula.
    // Además, que la fecha sea en el futuro.
    @NotNull(message = "La fecha de fin no puede ser nula.")
    @Future(message = "La fecha de fin debe ser en el futuro.")
    private LocalDate fechaFin;

    // Asegura que el motivo no sea nulo y no contenga solo espacios en blanco.
    @NotBlank(message = "El motivo no puede estar en blanco.")
    @Column(name = "motivo", length = 255, nullable = false)
    private String motivo;

    // Asegura que el estado no sea nulo.
    @NotNull(message = "El estado no puede ser nulo.")
    @Enumerated(EnumType.STRING) // IMPORTANTE: Guarda el nombre del enum
    private EstadoSolicitud estado;

    public SolicitudVacaciones() {
    }

    public SolicitudVacaciones(String nombreEmpleado, LocalDate fechaInicio, LocalDate fechaFin, String motivo, EstadoSolicitud estado) {
        this.nombreEmpleado = nombreEmpleado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.motivo = motivo;
        this.estado = estado;
    }

    public SolicitudVacaciones(Long id, String nombreEmpleado, LocalDate fechaInicio, LocalDate fechaFin, String motivo, EstadoSolicitud estado) {
        this.id = id;
        this.nombreEmpleado = nombreEmpleado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.motivo = motivo;
        this.estado = estado;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public EstadoSolicitud getEstado() {
        return estado;
    }

    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "SolicitudVacaciones{" +
                "id=" + id +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", motivo='" + motivo + '\'' +
                ", estado=" + estado +
                '}';
    }
}