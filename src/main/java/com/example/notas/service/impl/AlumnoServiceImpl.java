package com.example.notas.service.impl;

import com.example.notas.model.Alumno;
import com.example.notas.repository.AlumnoRepository;
import com.example.notas.service.AlumnoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AlumnoServiceImpl implements AlumnoService {
    private final AlumnoRepository alumnoRepository;


    public AlumnoServiceImpl(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }
    @Override
    public Page<Alumno> findAll(Pageable pageable){
        return alumnoRepository.findAll(pageable);
    }

    public Optional<Alumno> findById(Integer id){
        return alumnoRepository.findById(id);
    }
    public  Alumno create(Alumno alumno){
        return alumnoRepository.save(alumno);
    }

    public Alumno update(Integer Id, Alumno alumno){
        return alumnoRepository.save(alumno);
    }
    public void delete(Integer id){
        alumnoRepository.deleteById(id);
    }


}
