package com.example.notas.controller;

import com.example.notas.model.Alumno;
import com.example.notas.service.AlumnoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Alumnos")
public class AlumnoController {
    private final AlumnoService alumnoService;
    public AlumnoController(AlumnoService alumnoService){
        this.alumnoService = alumnoService;
    }
   @GetMapping
    public Page<Alumno> getAll(@RequestParam int page, @RequestParam int size){
        Pageable pageable = PageRequest.of(page, size);
        return alumnoService.findAll(pageable);
   }
   @GetMapping("/api/alumnos/{id}")
    public Alumno alumno (@PathVariable Integer id) {
       return alumnoService.findById(id).orElseThrow();

   }
   @PostMapping
    public Alumno create(@RequestBody Alumno alumno){
        return alumnoService.create(alumno);
   }
   @PutMapping("/{id}")
    public Alumno update(@PathVariable Integer id, @RequestBody Alumno alumno){
        return alumnoService.update(id,alumno);
   }
   @DeleteMapping("/{id}")
   public void delete(@PathVariable Integer id){
        alumnoService.delete(id);
   }
}
