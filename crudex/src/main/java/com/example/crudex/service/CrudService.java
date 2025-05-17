package com.example.crudex.service;

import com.example.crudex.entity.Crud;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.crudex.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CrudService {

    private final CrudRepository crudRepository;

    public Crud save(Crud crud) {
        return crudRepository.save(crud);
    }

    public List<Crud> findAll() {
        return crudRepository.findAll();
    }

    public Optional<Crud> findById(Long id) {
        return crudRepository.findById(id);
    }

    public Crud update(Long id, Crud updatedCrud) {
        Crud crud = crudRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 ID: " + id));

        crud.setName(updatedCrud.getName());
        crud.setEmail(updatedCrud.getEmail());
        crud.setAge(updatedCrud.getAge());

        return crudRepository.save(crud);
    }

    public void delete(Long id) {
        crudRepository.deleteById(id);
    }

}
