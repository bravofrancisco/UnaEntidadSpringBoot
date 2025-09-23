package com.franciscob.demo_proyectoSolicitudVacaciones.Controller.ControllerCanciones;

import com.franciscob.demo_proyectoSolicitudVacaciones.Models.Canciones;
import com.franciscob.demo_proyectoSolicitudVacaciones.Service.ServicesCanciones.ServicioCanciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/canciones")
public class ControllersCanciones {

    @Autowired
    private ServicioCanciones servicioCanciones;

    @GetMapping
    public List<Canciones>findAll(){
        return servicioCanciones.findAll();
    }
}
