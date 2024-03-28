package com.etulsa.mantenimiento.projectbeetulsa.services;


import com.etulsa.mantenimiento.projectbeetulsa.models.entities.OrdenTrabajoEntity;
import com.etulsa.mantenimiento.projectbeetulsa.repository.OrdenTrabajoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Senior Software Development Consultant Jordan Vicaña Alburqueque on 3/4/2024
 * @project Project-be-ETULSA
 */
@Service
public class OrdenTrabajoServiceImpl implements OrdenTrabajoService{
    private OrdenTrabajoRepository ordenTrabajoRepository;

    public OrdenTrabajoServiceImpl(OrdenTrabajoRepository ordenTrabajoRepository) {
        this.ordenTrabajoRepository = ordenTrabajoRepository;
    }

    @Override
    public List<OrdenTrabajoEntity> findAll() {
        return ordenTrabajoRepository.findAll();
    }

    @Override
    public Optional<OrdenTrabajoEntity> findById(Long id) {
        return ordenTrabajoRepository.findById(id);
    }

    @Override
    public OrdenTrabajoEntity save(OrdenTrabajoEntity ordenTrabajoEntity) {
        return ordenTrabajoRepository.save(ordenTrabajoEntity);
    }
}
