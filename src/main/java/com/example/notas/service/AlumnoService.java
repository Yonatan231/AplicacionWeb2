package com.example.notas.service;

import com.example.notas.model.Alumno;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AlumnoService {
    Page<Alumno> findAll(Pageable pageable);
    Optional<Alumno> findById(Integer id);
    Alumno create(Alumno alumno);
    Alumno update(Integer id, Alumno alumno);
    void delete(Integer id);

}
