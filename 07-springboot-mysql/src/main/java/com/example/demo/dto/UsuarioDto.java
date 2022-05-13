package com.example.demo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UsuarioDto implements Serializable {
    private final Integer identificadorUsuario;
    private final String nombre;
    private final String rut;
    private final Integer edad;
}
