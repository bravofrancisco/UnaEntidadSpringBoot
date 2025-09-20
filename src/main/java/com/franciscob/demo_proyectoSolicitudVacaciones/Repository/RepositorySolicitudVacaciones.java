package com.franciscob.demo_proyectoSolicitudVacaciones.Repository;

import com.franciscob.demo_proyectoSolicitudVacaciones.Models.SolicitudVacaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySolicitudVacaciones extends JpaRepository<SolicitudVacaciones, Long> {
}
