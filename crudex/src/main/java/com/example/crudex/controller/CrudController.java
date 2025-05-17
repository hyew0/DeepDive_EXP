package com.example.crudex.controller;

import com.example.crudex.entity.Crud;
import com.example.crudex.repository.CrudRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.crudex.service.CrudService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/crud")
public class CrudController {
    private final CrudService crudService;

    @PostMapping
    public Crud create(@RequestBody Crud crud) {
        return crudService.save(crud);
    }

    @GetMapping
    public List<Crud> readAll() {
        return crudService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Crud> read(@PathVariable Long id) {
        return crudService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    @PutMapping("/{id}")
    public Crud update(@PathVariable Long id, @RequestBody Crud crud) {
        return crudService.update(id, crud);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        crudService.delete(id);
    }
}
