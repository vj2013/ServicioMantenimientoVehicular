package com.etulsa.mantenimiento.projectbeetulsa.controllers;

import com.etulsa.mantenimiento.projectbeetulsa.models.entities.OrdenTrabajoEntity;
import com.etulsa.mantenimiento.projectbeetulsa.services.OrdenTrabajoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author Senior Software Development Consultant Jordan Vicaña Alburqueque on 3/4/2024
 * @project Project-be-ETULSA
 */
@RestController
@RequestMapping("/v1/ordenTrabajo")
public class OrdenTrabajoController {
    private final OrdenTrabajoService ordenTrabajoService;

    public OrdenTrabajoController(OrdenTrabajoService ordenTrabajoService) {
        this.ordenTrabajoService = ordenTrabajoService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<OrdenTrabajoEntity>> findAll() {
        return ResponseEntity.ok(ordenTrabajoService.findAll());
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody OrdenTrabajoEntity ordenTrabajoEntity, BindingResult result){
/*        if (result.hasErrors()) {
            return validate(result);
        }*/
        return ResponseEntity.status(HttpStatus.CREATED).body(ordenTrabajoService.save(ordenTrabajoEntity));
    }
}
