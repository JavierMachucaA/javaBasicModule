package com.example.demo;

import com.example.demo.core.IEstadisticasCore;
import com.example.demo.model.Rol;
import com.example.demo.model.Usuario;
import com.example.demo.model.dao.IRolDao;
import com.example.demo.model.dao.IUsuarioDao;
import com.example.demo.repository.IUsuarioService;
import com.example.demo.repository.impl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private IRolDao rolDao;

	@Autowired
	private IUsuarioService usuarioService;

	@Autowired
	private IEstadisticasCore estadisticasCore;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		List<Rol> roles = this.rolDao.findAll();
		System.out.println(Arrays.toString(roles.toArray()));

		Optional<Rol> rolRRHH = this.rolDao.findById(3);

		if (rolRRHH.isPresent()) {
			System.out.println("args = " + rolRRHH);
		} else {
			System.out.println("Rol "+ 3+" no fue encontrado");
		}

		List<Usuario> usuarios = this.usuarioService.findAll();
		System.out.println(Arrays.toString(usuarios.toArray()));

		// obtener lista de usuarios en base a método de crud
		Iterable<Integer> ids = Arrays.asList(1,2);

		Iterable<Usuario> usuarios2 = this.usuarioService.findAllById(ids);
		System.out.println("usuarios2 = ");
		for(Usuario s : usuarios2){
			System.out.println(s.toString());
		}

		// obtener contador de registro en la tabla de usuarios
		long cantidadUsuarios = this.usuarioService.count();

		System.out.println("cantidad de usuarios = " + cantidadUsuarios);

		// comprobar si el identificador del usuario existe
		boolean siExiste = this.usuarioService.existsById(4);

		System.out.println("Existe el usuario con id 4 = " + siExiste);
		// obtener informacion utilizando la nomenclatura base para consultar
		System.out.println("buscar por id y rut ");
		List<Usuario> listUsuariosPorIdRut = this.usuarioService.findByIdAndRut(1,"18565305-6");
		System.out.println(Arrays.toString(listUsuariosPorIdRut.toArray()));
		System.out.println("buscar por id, rut y  nombre ");
		List<Usuario> listUsuariosPorIdRutNombre = this.usuarioService.findByIdAndRutAndNombre(3,"22565305-0","eduado");
		System.out.println(Arrays.toString(listUsuariosPorIdRutNombre.toArray()));
		// por Hql
		System.out.println("buscar por rut ...");
		List<Usuario> usuariosRut = this.usuarioService.findByRut("11563200-1");
		System.out.println(Arrays.toString(usuariosRut.toArray()));
		System.out.println("buscar por rut y id...");
		List<Usuario> usuariosRutId = this.usuarioService.findByRutAndId("11563200-1",5);
		System.out.println(Arrays.toString(usuariosRutId.toArray()));
		// SQL
		System.out.println("buscar por todos los usuarios");
		List<Usuario> usuariosall = this.usuarioService.getAllUsers();
		System.out.println(Arrays.toString(usuariosall.toArray()));
		System.out.println("buscar por todos los usuarios superior a un id");
		Integer usuariosalloverid = this.usuarioService.getAllUsersById(3);
		System.out.println(usuariosalloverid);


		//HACER EJERCICIO NOMBRE CONTENGA UNA LETRA POR SQL
		this.estadisticasCore.ReporteUsuarios();

	}
}
