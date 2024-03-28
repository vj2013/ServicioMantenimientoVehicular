package com.etulsa.mantenimiento.projectbeetulsa.controllers;

import com.etulsa.mantenimiento.projectbeetulsa.models.entities.TecnicoEntity;
import com.etulsa.mantenimiento.projectbeetulsa.services.TecnicoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Senior Software Development Consultant Jordan Vicaña Alburqueque on 3/4/2024
 * @project Project-be-ETULSA
 */
@RestController
@RequestMapping("/v1/tecnico")
public class TecnicoController {
    private final TecnicoService tecnicoService;

    public TecnicoController(TecnicoService tecnicoService) {
        this.tecnicoService = tecnicoService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<TecnicoEntity>> findAll() {
        return ResponseEntity.ok(tecnicoService.findAll());
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody TecnicoEntity tecnicoEntity){
        return ResponseEntity.status(HttpStatus.CREATED).body(tecnicoService.save(tecnicoEntity));
    }
}
