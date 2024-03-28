package com.etulsa.mantenimiento.projectbeetulsa.services;

import com.etulsa.mantenimiento.projectbeetulsa.models.entities.TecnicoEntity;

import java.util.List;
import java.util.Optional;

/**
 * @author Senior Software Development Consultant Jordan Vicaña Alburqueque on 3/4/2024
 * @project Project-be-ETULSA
 */
public interface TecnicoService {
    List<TecnicoEntity> findAll();
    Optional<TecnicoEntity> findById(Long id);
    TecnicoEntity save(TecnicoEntity tecnicoEntity);

}
