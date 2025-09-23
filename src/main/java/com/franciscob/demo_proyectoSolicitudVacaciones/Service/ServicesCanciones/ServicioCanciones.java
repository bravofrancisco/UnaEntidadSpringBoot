package com.franciscob.demo_proyectoSolicitudVacaciones.Service.ServicesCanciones;

import com.franciscob.demo_proyectoSolicitudVacaciones.Models.Canciones;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ServicioCanciones {

    List<Canciones>findAll();
    Optional<Canciones>findById(Long id);
}
