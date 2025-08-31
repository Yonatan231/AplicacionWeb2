package com.example.notas.controller;

import com.example.notas.model.Inscripcion;
import com.example.notas.service.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inscripciones")
public class InscripcionController {

    @Autowired
    private InscripcionService inscripcionService;

    @GetMapping
    public Page<Inscripcion> getAll(@RequestParam int page , @RequestParam int size) {
    Pageable pageable = PageRequest.of(page, size);
    return inscripcionService.findAll(pageable);
    }
    @GetMapping("/{id}")
    public Inscripcion getById(@PathVariable Long id){
        return inscripcionService.findById(id)
               .orElseThrow(() -> new RuntimeException("No se encontro la inscripcion "+id));
    }

    @PostMapping
    public Inscripcion create(@RequestBody Inscripcion inscripcion){
        return inscripcionService.create(inscripcion);
    }

    @PutMapping("/{id}")
    public Inscripcion update(@PathVariable Long id, @RequestBody Inscripcion inscripcion){
        return inscripcionService.update(inscripcion);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id){
        inscripcionService.deleteById(id);
    }

}
