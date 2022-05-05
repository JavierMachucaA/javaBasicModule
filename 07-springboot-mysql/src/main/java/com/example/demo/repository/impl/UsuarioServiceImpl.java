package com.example.demo.repository.impl;

import com.example.demo.model.Usuario;
import com.example.demo.model.dao.IUsuarioDao;
import com.example.demo.repository.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    private IUsuarioDao usuarioDao;

    @Override
    public List<Usuario> findAll() {
        return this.usuarioDao.findAll();
    }

    @Override
    public Optional<Usuario> findById(Integer id) {
        return this.usuarioDao.findById(id);
    }

    @Override
    public Iterable<Usuario> findAllById(Iterable<Integer> ids) {
        return this.usuarioDao.findAllById(ids);
    }

    @Override
    public boolean existsById(Integer id) {
        return this.usuarioDao.existsById(id);
    }

    @Override
    public long count() {
        return this.usuarioDao.count();
    }

    @Override
    public List<Usuario> findByIdAndRut(Integer id, String rut) {
        return this.usuarioDao.findByIdentificadorUsuarioAndRut(id,rut);
    }

    @Override
    public List<Usuario> findByIdAndRutAndNombre(Integer id, String rut, String nombre) {
        return this.usuarioDao.findByIdentificadorUsuarioAndRutAndNombre(id,rut,nombre);
    }

    @Override
    public List<Usuario> findByRut(String rut) {
        return this.usuarioDao.findByRut(rut);
    }

    @Override
    public List<Usuario> findByRutAndId(String rut, Integer id) {
        return this.usuarioDao.findByRutAndId(rut, id);
    }

    @Override
    public List<Usuario> getAllUsers() {
        return this.usuarioDao.getAllUsers();
    }

    @Override
    public Integer getAllUsersById(Integer id) {
        return this.usuarioDao.getAllUsersById(id);
    }

    @Override
    public List<Usuario> getAllUsersWithF() {
        return this.usuarioDao.getAllUsersWithF();
    }


}
