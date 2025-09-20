package com.franciscob.demo_proyectoSolicitudVacaciones.Service;
import com.franciscob.demo_proyectoSolicitudVacaciones.Models.SolicitudVacaciones;
import com.franciscob.demo_proyectoSolicitudVacaciones.Repository.RepositorySolicitudVacaciones;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceSolicitudVacacionesImpl  implements  ServiceSolicitudVacaciones{

   private final RepositorySolicitudVacaciones repositorySolicitudVacaciones;

    public ServiceSolicitudVacacionesImpl(RepositorySolicitudVacaciones repositorySolicitudVacaciones) {
        this.repositorySolicitudVacaciones = repositorySolicitudVacaciones;
    }

    @Override
    public List<SolicitudVacaciones> findAll() {
        return repositorySolicitudVacaciones.findAll();
    }

    @Override
    public Optional<SolicitudVacaciones> findById(Long id) {
        return  repositorySolicitudVacaciones.findById(id);
    }

    @Override
    public Optional<SolicitudVacaciones> deleteById(Long id) {
       Optional<SolicitudVacaciones> sv = repositorySolicitudVacaciones.findById(id);
       sv.ifPresent(repositorySolicitudVacaciones::delete);
       return sv;
    }

    @Override
    public SolicitudVacaciones save(SolicitudVacaciones solicitudVacaciones) {
        return  repositorySolicitudVacaciones.save(solicitudVacaciones);
    }

    @Override
    public Optional<SolicitudVacaciones> update(Long id, SolicitudVacaciones updatesolicitudVacaciones) {
        return  repositorySolicitudVacaciones.findById(id).map(existeSolicitud ->{
            existeSolicitud.setNombreEmpleado(updatesolicitudVacaciones.getNombreEmpleado());
            existeSolicitud.setFechaInicio(updatesolicitudVacaciones.getFechaInicio());
            existeSolicitud.setFechaFin(updatesolicitudVacaciones.getFechaFin());
            existeSolicitud.setMotivo(updatesolicitudVacaciones.getMotivo());
            existeSolicitud.setEstado(updatesolicitudVacaciones.getEstado());

            return  repositorySolicitudVacaciones.save(existeSolicitud);
        });
    }
}
