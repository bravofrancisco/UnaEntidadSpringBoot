package com.franciscob.demo_proyectoSolicitudVacaciones.Controller;

import com.franciscob.demo_proyectoSolicitudVacaciones.Dto.SolicitudVacacionesRequestDTO;
import com.franciscob.demo_proyectoSolicitudVacaciones.Dto.SolicitudVacacionesResponseDTO;
import com.franciscob.demo_proyectoSolicitudVacaciones.Models.SolicitudVacaciones;
import com.franciscob.demo_proyectoSolicitudVacaciones.Service.ServiceSolicitudVacaciones;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Validated
@RequestMapping("/api/solicitud")
@RestController
public class ControllerSolicitudVacaciones {

    @Autowired
    private ServiceSolicitudVacaciones serviceSolicitudVacaciones;

    @GetMapping
    public ResponseEntity<List<SolicitudVacacionesResponseDTO>> findAll(){
       List<SolicitudVacaciones> sVacaciones = serviceSolicitudVacaciones.findAll();
       //convertir entidad a dto
        List<SolicitudVacacionesResponseDTO>responseDTO = sVacaciones.stream()
                .map(vacaciones -> new SolicitudVacacionesResponseDTO(
                        vacaciones.getId(),
                        vacaciones.getNombreEmpleado(),
                        vacaciones.getFechaInicio(),
                        vacaciones.getFechaFin(),
                        vacaciones.getMotivo(),
                        vacaciones.getEstado()
                )).toList();
       return ResponseEntity.ok(responseDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SolicitudVacacionesResponseDTO> findById(
            @PathVariable @Positive(message = "El ID debe ser mayor a 0") Long id) {

        return serviceSolicitudVacaciones.findById(id)
                .map(vacaciones -> new SolicitudVacacionesResponseDTO(
                        vacaciones.getId(),
                        vacaciones.getNombreEmpleado(),
                        vacaciones.getFechaInicio(),
                        vacaciones.getFechaFin(),
                        vacaciones.getMotivo(),
                        vacaciones.getEstado()
                ))
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable @Positive(message = "El ID debe ser mayor a 0") Long id) {
        Optional<SolicitudVacaciones> productoEliminado = serviceSolicitudVacaciones.deleteById(id);

        return productoEliminado.isPresent()
                ? ResponseEntity.noContent().build() // 204 No Content
                : ResponseEntity.notFound().build(); // 404 Not Found
    }

    @PostMapping
    public ResponseEntity<SolicitudVacacionesResponseDTO> save(@Valid @RequestBody SolicitudVacacionesRequestDTO svRequest) {

        SolicitudVacaciones entity = new SolicitudVacaciones();
        entity.setNombreEmpleado(svRequest.getNombreEmpleado());
        entity.setFechaInicio(svRequest.getFechaInicio());
        entity.setFechaFin(svRequest.getFechaFin());
        entity.setMotivo(svRequest.getMotivo());
        entity.setEstado(svRequest.getEstado());

        //guardar entiad
        SolicitudVacaciones nuevaSolicitud = serviceSolicitudVacaciones.save((entity));

        //crear DTO

        SolicitudVacacionesResponseDTO responseDTO = new SolicitudVacacionesResponseDTO(
                nuevaSolicitud.getId(),
                nuevaSolicitud.getNombreEmpleado(),
                nuevaSolicitud.getFechaInicio(),
                nuevaSolicitud.getFechaFin(),
                nuevaSolicitud.getMotivo(),
                nuevaSolicitud.getEstado()
        );

        //devolver 201
        return  ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SolicitudVacacionesResponseDTO> update(
            @PathVariable @Positive(message = "El id debe ser mayor a 0") Long id,
            @Valid @RequestBody SolicitudVacacionesRequestDTO nuevaSolicitud
    ) {
        // Construir entidad con los datos nuevos
        SolicitudVacaciones solicitudVacacionesActualizar = new SolicitudVacaciones();
        solicitudVacacionesActualizar.setNombreEmpleado(nuevaSolicitud.getNombreEmpleado());
        solicitudVacacionesActualizar.setFechaInicio(nuevaSolicitud.getFechaInicio());
        solicitudVacacionesActualizar.setFechaFin(nuevaSolicitud.getFechaFin());
        solicitudVacacionesActualizar.setMotivo(nuevaSolicitud.getMotivo());
        solicitudVacacionesActualizar.setEstado(nuevaSolicitud.getEstado());

        // Actualizar y convertir a DTO si fue exitosa
        return serviceSolicitudVacaciones.update(id, solicitudVacacionesActualizar)
                .map(actualizada -> {
                    SolicitudVacacionesResponseDTO responseDTO = new SolicitudVacacionesResponseDTO(
                            actualizada.getId(),
                            actualizada.getNombreEmpleado(),
                            actualizada.getFechaInicio(),
                            actualizada.getFechaFin(),
                            actualizada.getMotivo(),
                            actualizada.getEstado()
                    );
                    return ResponseEntity.ok(responseDTO);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
