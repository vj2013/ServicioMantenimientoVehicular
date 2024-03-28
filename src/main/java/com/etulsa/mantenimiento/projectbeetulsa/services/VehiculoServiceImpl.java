package com.etulsa.mantenimiento.projectbeetulsa.services;


import com.etulsa.mantenimiento.projectbeetulsa.models.entities.VehiculoEntity;
import com.etulsa.mantenimiento.projectbeetulsa.repository.VehiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Senior Software Development Consultant Jordan Vicaña Alburqueque on 3/4/2024
 * @project Project-be-ETULSA
 */
@Service
public class VehiculoServiceImpl implements VehiculoService{
    private VehiculoRepository vehiculoRepository;

    public VehiculoServiceImpl(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    @Override
    public List<VehiculoEntity> findAll() {
        return (List<VehiculoEntity>) vehiculoRepository.findAll();
    }

    @Override
    public Optional<VehiculoEntity> findById(Long id) {
        return vehiculoRepository.findById(id);
    }

    @Override
    public VehiculoEntity save(VehiculoEntity vehiculoEntity) {
        return vehiculoRepository.save(vehiculoEntity);
    }
}
