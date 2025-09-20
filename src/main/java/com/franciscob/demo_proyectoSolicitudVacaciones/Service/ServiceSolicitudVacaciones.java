package com.franciscob.demo_proyectoSolicitudVacaciones.Service;
import com.franciscob.demo_proyectoSolicitudVacaciones.Models.SolicitudVacaciones;
import java.util.List;
import java.util.Optional;

public interface ServiceSolicitudVacaciones  {

    List<SolicitudVacaciones>findAll();
    Optional<SolicitudVacaciones>findById(Long id);
    Optional<SolicitudVacaciones>deleteById(Long id);
    SolicitudVacaciones save (SolicitudVacaciones solicitudVacaciones);
    Optional<SolicitudVacaciones>update(Long id, SolicitudVacaciones updatesolicitudVacaciones);
}
