package com.example.notas.repository;

import com.example.notas.model.Alumno;
import com.example.notas.model.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
