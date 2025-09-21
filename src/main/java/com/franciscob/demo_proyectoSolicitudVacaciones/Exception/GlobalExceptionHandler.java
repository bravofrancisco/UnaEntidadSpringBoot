package com.franciscob.demo_proyectoSolicitudVacaciones.Exception;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GlobalExceptionHandler {
@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String , String>> handleValidationErrors(MethodArgumentNotValidException ex){
        Map<String, String > erros = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error->
                erros.put(error.getField(), error.getDefaultMessage())
                );
        return  ResponseEntity.badRequest().body(erros);
    }

    // 🟧 2. Validaciones como @Positive en @PathVariable o @RequestParam
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Map<String, String>> handleConstraintViolations(ConstraintViolationException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getConstraintViolations().forEach(error ->
                errors.put("error", error.getMessage())
        );
        return ResponseEntity.badRequest().body(errors);
    }

    // 🟨 3. Errores personalizados lanzados en el servicio (como fechas incorrectas)
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> handleIllegalArgument(IllegalArgumentException ex) {
        Map<String, String> error = new HashMap<>();
        error.put("error", ex.getMessage());
        return ResponseEntity.badRequest().body(error);
    }

    // 🟦 4. Cualquier otra excepción inesperada
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleGeneralException(Exception ex) {
        Map<String, String> error = new HashMap<>();
        error.put("error", "Error interno del servidor: " + ex.getMessage());
        return ResponseEntity.internalServerError().body(error);
    }
}
