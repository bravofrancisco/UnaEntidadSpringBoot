package com.franciscob.demo_proyectoSolicitudVacaciones.Repository;

import com.franciscob.demo_proyectoSolicitudVacaciones.Models.Canciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCanciones extends JpaRepository<Canciones, Long> {
}
