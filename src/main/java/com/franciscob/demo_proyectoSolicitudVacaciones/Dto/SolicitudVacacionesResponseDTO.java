package com.franciscob.demo_proyectoSolicitudVacaciones.Dto;

import com.franciscob.demo_proyectoSolicitudVacaciones.Models.Enum.EstadoSolicitud;

import java.time.LocalDate;

public class SolicitudVacacionesResponseDTO {

    private final Long id;
    private final String nombreEmpleado;
    private final LocalDate fechaInicio;
    private final LocalDate fechaFin;
    private final String motivo;
    private final EstadoSolicitud estado;

    public SolicitudVacacionesResponseDTO(Long id, String nombreEmpleado, LocalDate fechaInicio, LocalDate fechaFin, String motivo, EstadoSolicitud estado) {
        this.id = id;
        this.nombreEmpleado = nombreEmpleado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.motivo = motivo;
        this.estado = estado;
    }

    public Long getId() {
        return id;
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
        return "SolicitudVacacionesResponseDTO{" +
                "id=" + id +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", motivo='" + motivo + '\'' +
                ", estado=" + estado +
                '}';
    }
}

