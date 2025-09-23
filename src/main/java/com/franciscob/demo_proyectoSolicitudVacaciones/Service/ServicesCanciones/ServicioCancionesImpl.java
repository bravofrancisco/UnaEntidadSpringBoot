package com.franciscob.demo_proyectoSolicitudVacaciones.Service.ServicesCanciones;

import com.franciscob.demo_proyectoSolicitudVacaciones.Models.Canciones;
import com.franciscob.demo_proyectoSolicitudVacaciones.Repository.RepositoryCanciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioCancionesImpl implements  ServicioCanciones{

    @Autowired
    private RepositoryCanciones repositoryCanciones;

    public List<Canciones>findAll(){
        return repositoryCanciones.findAll();
    }

    @Override
    public Optional<Canciones> findById(Long id) {
        return Optional.empty();
    }
}
