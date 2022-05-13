package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table( name = "usuario")
@Data // reemplaza getter, setter y contructor con todos sus atributos
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id_usuario")
    private Integer identificadorUsuario;

    private String nombre;

    private String rut;

    private Integer edad;

    @OneToOne(targetEntity = Rol.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="id_rol",referencedColumnName = "id_rol")
    private Rol rol;
}
