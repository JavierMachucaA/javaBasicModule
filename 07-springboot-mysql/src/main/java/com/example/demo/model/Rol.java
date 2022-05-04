package com.example.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table( name = "rol")
@Data // reemplaza getter, setter y contructor con todos sus atributos
@ToString
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id_rol")
    private Integer idRol;

    //@Column( name = "description")
    private String description;
}
