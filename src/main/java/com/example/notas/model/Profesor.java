package com.example.notas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import lombok.Data;

import java.util.Date;
@Entity
@Table(name= "profesores")
@Data
public class Profesor {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private  Integer id_profesor;

    private String nombre;
    private String apellido;
    private String email;
    private String especialidad;

    public void setId(Integer id){
        this.id_profesor=id;

    }
}
