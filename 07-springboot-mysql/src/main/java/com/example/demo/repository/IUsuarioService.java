package com.example.demo.repository;

import com.example.demo.model.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface IUsuarioService  {
    // creados
    List<Usuario> findAll();
    Optional<Usuario> findById(Integer id);
    // nativos
    Iterable<Usuario> findAllById(Iterable<Integer> ids);
    boolean existsById(Integer id);
    long count();
    // nomenclatura base para llamar a crud
    List<Usuario> findByIdAndRut(Integer id, String rut);
    List<Usuario> findByIdAndRutAndNombre(Integer id, String rut, String nombre);
    //HQL
    List<Usuario> findByRut(String rut);
    List<Usuario> findByRutAndId(String rut, Integer id);

    //sql
    List<Usuario> getAllUsers();
    Integer getAllUsersById(Integer id);

    List<Usuario> getAllUsersWithF();
}
