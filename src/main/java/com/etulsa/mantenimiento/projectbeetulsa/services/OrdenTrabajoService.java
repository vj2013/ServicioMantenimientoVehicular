package com.etulsa.mantenimiento.projectbeetulsa.services;

import com.etulsa.mantenimiento.projectbeetulsa.models.entities.OrdenTrabajoEntity;

import java.util.List;
import java.util.Optional;

/**
 * @author Senior Software Development Consultant Jordan Vicaña Alburqueque on 3/4/2024
 * @project Project-be-ETULSA
 */
public interface OrdenTrabajoService {
    List<OrdenTrabajoEntity> findAll();
    Optional<OrdenTrabajoEntity> findById(Long id);
    OrdenTrabajoEntity save(OrdenTrabajoEntity ordenTrabajoEntity);

}
