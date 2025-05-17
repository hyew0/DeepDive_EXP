package com.example.crudex.repository;

import com.example.crudex.entity.Crud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepository extends JpaRepository<Crud, Long> {
}
