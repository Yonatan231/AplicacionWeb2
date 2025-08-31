package com.example.notas.controller;

import com.example.notas.model.Asignatura;
import com.example.notas.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/asignaturas")
public class AsignaturaController {
@Autowired
    private AsignaturaService asignaturaService;

    @GetMapping
    public Page<Asignatura> getAll(@RequestParam int page, @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        return asignaturaService.findAll(pageable);

    }

    @GetMapping("/{id}")
    public Asignatura getById(@RequestParam long id){
        return asignaturaService.findById(id)
                .orElseThrow(() -> new RuntimeException("Asignatura no encontrada con id " + id));
    }
    @PostMapping
    public Asignatura create(@RequestBody Asignatura asignatura){
        return asignaturaService.create(asignatura);
    }
    @PutMapping("/{id}")
    public Asignatura update(@PathVariable Long id, @RequestBody Asignatura asignatura){
        return asignaturaService.update(asignatura);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        asignaturaService.deleteById(id);
    }

}
