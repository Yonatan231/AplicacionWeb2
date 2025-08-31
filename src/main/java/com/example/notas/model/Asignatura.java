package com.example.notas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "asignatura")
@Data
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_asignatura;

    private String nombre_aignatura;

    @ManyToOne
    @JoinColumn(name="id_profesor")
    private Profesor profesor;
}
