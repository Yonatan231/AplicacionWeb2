package com.example.notas.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name="inscripciones")
@Data
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_inscripcion;
    private LocalDate anio_escolar;

@ManyToOne
    @JoinColumn(name="id_asignatura")
    private Asignatura asignatura;

@ManyToOne
    @JoinColumn(name="id_alumno")
    private Alumno alumno;

}
