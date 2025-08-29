package com.example.notas.service.impl;

import com.example.notas.model.Profesor;
import com.example.notas.repository.ProfesorRepository;
import com.example.notas.service.ProfesorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfesorServiceimpl  implements ProfesorService {
    private  final ProfesorRepository profesorRepository;

    public ProfesorServiceimpl(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    @Override
    public Page<Profesor> findAll(Pageable pageable) {
       return profesorRepository.findAll(pageable);
    }

    @Override
    public Optional<Profesor> findById(Integer id) {
        return profesorRepository.findById(id);
    }

    @Override
    public Profesor create(Profesor profesor) {
       return profesorRepository.save(profesor);
    }

    @Override
    public Profesor update(Integer Id, Profesor profesor) {
      profesor.setId(Id);
      return profesorRepository.save(profesor);
    }

    @Override
    public void delete(Integer Id) {
        profesorRepository.deleteById(Id);

    }
}
