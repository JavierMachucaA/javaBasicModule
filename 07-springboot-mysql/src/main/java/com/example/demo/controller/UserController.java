package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.repository.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UserController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<?> getUsers(){
        List<Usuario> usuarioList = this.usuarioService.findAll();

        return new ResponseEntity<>(usuarioList, HttpStatus.OK);
    }
}
