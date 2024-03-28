package com.etulsa.mantenimiento.projectbeetulsa.controllers;

import com.etulsa.mantenimiento.projectbeetulsa.models.entities.VehiculoEntity;
import com.etulsa.mantenimiento.projectbeetulsa.services.VehiculoService;
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
@RequestMapping("/v1/vehiculo")
public class VehiculoController {
    private final VehiculoService vehiculoService;

    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<VehiculoEntity>> findAll() {
        return ResponseEntity.ok(vehiculoService.findAll());
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody VehiculoEntity vehiculoEntity){
        return ResponseEntity.status(HttpStatus.CREATED).body(vehiculoService.save(vehiculoEntity));
    }
}
