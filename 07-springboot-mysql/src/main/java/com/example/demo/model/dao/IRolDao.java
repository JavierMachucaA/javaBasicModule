package com.example.demo.model.dao;

import com.example.demo.model.Rol;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface IRolDao extends CrudRepository<Rol, Integer> {

    List<Rol> findAll();

    Optional<Rol> findById(Integer id);
}
