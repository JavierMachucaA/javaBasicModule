package com.example.demo.model.dao;

import com.example.demo.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface IUsuarioDao extends CrudRepository<Usuario, Integer> {
    // customizados sin modificaciones de forma
    List<Usuario> findAll();
    Optional<Usuario> findById(Integer id);
    // obtencion por nomenclaturas
    List<Usuario> findByIdentificadorUsuarioAndRut(Integer id, String rut);
    List<Usuario> findByIdentificadorUsuarioAndRutAndNombre(Integer id, String rut, String nombre);

    @Query("select u from Usuario as u where u.rut=?1")
    List<Usuario> findByRut(String rut);
    @Query("select u from Usuario as u where u.rut= :rut and u.identificadorUsuario = :id")
    List<Usuario> findByRutAndId(@Param("rut") String rut, @Param("id")Integer id);

    @Query(value = "select * from usuario", nativeQuery = true)
    List<Usuario> getAllUsers();

    @Query(value = "select count(*) from usuario  where id_usuario > ?1", nativeQuery = true)
    Integer getAllUsersById(Integer id);

}
