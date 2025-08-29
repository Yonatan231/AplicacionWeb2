package com.example.notas.service;

import com.example.notas.model.Profesor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProfesorService {
    Page<Profesor> findAll(Pageable pageable);
    Optional<Profesor> findById(Integer id);
    Profesor create(Profesor profesor);
    Profesor update(Integer Id, Profesor profesor);
    void delete(Integer Id);
}
