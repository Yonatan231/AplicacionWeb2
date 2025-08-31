package com.example.notas.service.impl;
import com.example.notas.model.Asignatura;
import com.example.notas.repository.AsignaturaRepository;
import com.example.notas.service.AsignaturaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturaServiceImpl implements AsignaturaService {
    private final AsignaturaRepository asignaturaRepository;


    public AsignaturaServiceImpl(AsignaturaRepository asignaturaRepository) {
        this.asignaturaRepository = asignaturaRepository;

    }

    @Override
    public Page<Asignatura> findAll(Pageable pageable) {
        return asignaturaRepository.findAll(pageable);
    }

    @Override
    public Optional<Asignatura> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Asignatura create(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    @Override
    public Asignatura update(Asignatura asignatura) {
        return  asignaturaRepository.save(asignatura);
    }

    @Override
    public void deleteById(Long id) {
        asignaturaRepository.deleteById(id);
    }


}
