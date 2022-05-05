package com.example.demo;

import com.example.demo.core.IEstadisticasCore;
import com.example.demo.model.Rol;
import com.example.demo.model.Usuario;
import com.example.demo.model.dao.IRolDao;
import com.example.demo.model.dao.IUsuarioDao;
import com.example.demo.repository.IUsuarioService;
import com.example.demo.repository.impl.UsuarioServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@SpringBootApplication
@Log4j2
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
		log.info(Arrays.toString(roles.toArray()));

		Optional<Rol> rolRRHH = this.rolDao.findById(3);

		if (rolRRHH.isPresent()) {
			log.info("args = " + rolRRHH);
		} else {
			log.info("Rol "+ 3+" no fue encontrado");
		}

		List<Usuario> usuarios = this.usuarioService.findAll();
		log.info(Arrays.toString(usuarios.toArray()));

		// obtener lista de usuarios en base a método de crud
		Iterable<Integer> ids = Arrays.asList(1,2);

		Iterable<Usuario> usuarios2 = this.usuarioService.findAllById(ids);
		log.info("usuarios2 = ");
		for(Usuario s : usuarios2){
			log.info(s.toString());
		}

		// obtener contador de registro en la tabla de usuarios
		long cantidadUsuarios = this.usuarioService.count();

		log.info("cantidad de usuarios = " + cantidadUsuarios);

		// comprobar si el identificador del usuario existe
		boolean siExiste = this.usuarioService.existsById(4);

		log.info("Existe el usuario con id 4 = " + siExiste);
		// obtener informacion utilizando la nomenclatura base para consultar
		log.info("buscar por id y rut ");
		List<Usuario> listUsuariosPorIdRut = this.usuarioService.findByIdAndRut(1,"18565305-6");
		log.info(Arrays.toString(listUsuariosPorIdRut.toArray()));
		log.info("buscar por id, rut y  nombre ");
		List<Usuario> listUsuariosPorIdRutNombre = this.usuarioService.findByIdAndRutAndNombre(3,"22565305-0","eduado");
		log.info(Arrays.toString(listUsuariosPorIdRutNombre.toArray()));
		// por Hql
		log.info("buscar por rut ...");
		List<Usuario> usuariosRut = this.usuarioService.findByRut("11563200-1");
		log.info(Arrays.toString(usuariosRut.toArray()));
		log.info("buscar por rut y id...");
		List<Usuario> usuariosRutId = this.usuarioService.findByRutAndId("11563200-1",5);
		log.info(Arrays.toString(usuariosRutId.toArray()));
		// SQL
		log.info("buscar por todos los usuarios");
		List<Usuario> usuariosall = this.usuarioService.getAllUsers();
		log.info(Arrays.toString(usuariosall.toArray()));
		log.info("buscar por todos los usuarios superior a un id");
		Integer usuariosalloverid = this.usuarioService.getAllUsersById(3);
		log.info(usuariosalloverid);


		//HACER EJERCICIO NOMBRE CONTENGA UNA LETRA POR SQL

// select * from usuario where upper(nombre) like '%F%'
		List<Usuario> usuarioConF = this.usuarioService.getAllUsersWithF();
		log.info(Arrays.toString(usuarioConF.toArray()));
		this.estadisticasCore.ReporteUsuarios();

	}
}
