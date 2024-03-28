package com.etulsa.mantenimiento.projectbeetulsa.services;

import com.etulsa.mantenimiento.projectbeetulsa.models.entities.VehiculoEntity;

import java.util.List;
import java.util.Optional;

/**
 * @author Senior Software Development Consultant Jordan Vicaña Alburqueque on 3/4/2024
 * @project Project-be-ETULSA
 */
public interface VehiculoService {
    List<VehiculoEntity> findAll();
    Optional<VehiculoEntity> findById(Long id);
    VehiculoEntity save(VehiculoEntity vehiculoEntity);

}
