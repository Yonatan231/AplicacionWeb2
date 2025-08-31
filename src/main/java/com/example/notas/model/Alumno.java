package com.example.notas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

import java.time.LocalDate;


@Entity
@Table(name="alumnos")
@Data
public class Alumno {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer id_alumno;

    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private String email;

    public Alumno() {}

    }
