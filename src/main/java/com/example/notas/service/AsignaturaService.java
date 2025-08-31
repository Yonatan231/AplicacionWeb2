package com.example.notas.service;

import com.example.notas.model.Asignatura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface AsignaturaService {
    Page<Asignatura> findAll(Pageable pageable);
    Optional<Asignatura> findById(Long id);
    Asignatura create(Asignatura asignatura);
    Asignatura update(Asignatura asignatura);
    void deleteById(Long id);
}
