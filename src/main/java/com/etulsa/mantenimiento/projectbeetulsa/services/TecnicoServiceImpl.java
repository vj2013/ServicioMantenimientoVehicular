package com.etulsa.mantenimiento.projectbeetulsa.services;


import com.etulsa.mantenimiento.projectbeetulsa.models.entities.TecnicoEntity;
import com.etulsa.mantenimiento.projectbeetulsa.repository.TecnicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Senior Software Development Consultant Jordan Vicaña Alburqueque on 3/4/2024
 * @project Project-be-ETULSA
 */
@Service
public class TecnicoServiceImpl implements TecnicoService{
    private TecnicoRepository tecnicoRepository;

    public TecnicoServiceImpl(TecnicoRepository tecnicoRepository) {
        this.tecnicoRepository = tecnicoRepository;
    }

    @Override
    public List<TecnicoEntity> findAll() {
        return (List<TecnicoEntity>) tecnicoRepository.findAll();
    }

    @Override
    public Optional<TecnicoEntity> findById(Long id) {
        return tecnicoRepository.findById(id);
    }

    @Override
    public TecnicoEntity save(TecnicoEntity tecnicoEntity) {
        return tecnicoRepository.save(tecnicoEntity);
    }
}
