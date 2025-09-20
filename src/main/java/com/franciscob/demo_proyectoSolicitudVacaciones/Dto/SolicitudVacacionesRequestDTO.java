package com.franciscob.demo_proyectoSolicitudVacaciones.Dto;

import com.franciscob.demo_proyectoSolicitudVacaciones.Models.Enum.EstadoSolicitud;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class SolicitudVacacionesRequestDTO {

    @NotBlank(message = "El nombre del empleado no puede estar en blanco.")
    private String nombreEmpleado;

    @NotNull(message = "La fecha de inicio no puede ser nula.")
    @FutureOrPresent(message = "La fecha de inicio debe ser en el presente o en el futuro.")
    private LocalDate fechaInicio;

    @NotNull(message = "La fecha de fin no puede ser nula.")
    @Future(message = "La fecha de fin debe ser en el futuro.")
    private LocalDate fechaFin;

    @NotBlank(message = "El motivo no puede estar en blanco.")
    private String motivo;

    // Asegura que el estado no sea nulo.
    @NotNull(message = "El estado no puede ser nulo.")
    @Enumerated(EnumType.STRING) // IMPORTANTE: Guarda el nombre del enum
    private EstadoSolicitud estado;

    public SolicitudVacacionesRequestDTO(String nombreEmpleado, LocalDate fechaInicio, LocalDate fechaFin, String motivo, EstadoSolicitud estado) {
        this.nombreEmpleado = nombreEmpleado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.motivo = motivo;
        this.estado = estado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public String getMotivo() {
        return motivo;
    }

    public EstadoSolicitud getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "SolicitudVacacionesRequestDTO{" +
                "nombreEmpleado='" + nombreEmpleado + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", motivo='" + motivo + '\'' +
                ", estado=" + estado +
                '}';
    }
}
