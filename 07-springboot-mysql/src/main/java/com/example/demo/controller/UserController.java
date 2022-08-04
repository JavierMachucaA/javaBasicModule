package com.example.demo.controller;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.model.Rol;
import com.example.demo.model.Usuario;
import com.example.demo.model.dao.IRolDao;
import com.example.demo.repository.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UserController {

    @Autowired
    private IUsuarioService usuarioService;

    @Autowired
    private IRolDao rolDao;

    @GetMapping
    public ResponseEntity<?> getUsers(){
        List<Usuario> usuarioList = this.usuarioService.findAll();

        return new ResponseEntity<>(usuarioList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> postUsuario(@RequestBody UsuarioDto user) {
        Optional<Rol> rol = this.rolDao.findById(1);
        Usuario usertmp = new Usuario(null,user.getNombre(),user.getRut(),user.getEdad(),rol.get());
        Usuario usuariobd = this.usuarioService.save(usertmp);
        return new ResponseEntity<>(usuariobd,HttpStatus.ALREADY_REPORTED);
    }
}
