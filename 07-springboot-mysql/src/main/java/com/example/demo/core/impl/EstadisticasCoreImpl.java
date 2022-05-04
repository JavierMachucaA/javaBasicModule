package com.example.demo.core.impl;

import com.example.demo.core.IEstadisticasCore;
import com.example.demo.model.Usuario;
import com.example.demo.model.dao.IRolDao;
import com.example.demo.model.dao.IUsuarioDao;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstadisticasCoreImpl implements IEstadisticasCore {
    private Logger log = LoggerFactory.getLogger(EstadisticasCoreImpl.class);

    @Autowired
    private IUsuarioDao userDao;

    @Autowired
    private IRolDao rolDao ;


    @Override
    public void ReporteUsuarios() {
        // ejemplo
        Integer cantidadUsuariosTotales = 0;
        List<Usuario> usuarios = null;

        // cristian
        Integer cantidadUsuariosAdministradores = 0;
        // angello
        Double edadPromedio = 0d;
        // mauricio
        List<String> rutList = new ArrayList<>();
        List<Integer> cantidadUsuariosPorRorRolList = new ArrayList<>();


        log.info("#######################################################");
        log.info("#             Reports Users System                    #");
        log.info("#######################################################");
        log.info("# INIT REPORT USERS SYSTEM #");

        try{
            usuarios = this.userDao.findAll();
            cantidadUsuariosTotales = usuarios.size();
            System.out.println("cantidad de usuarios sistema :"+cantidadUsuariosTotales);
            List<Usuario> usuariosAdministrador = usuarios.stream().filter(
                    f->f.getRol().getIdRol()== 1
            ).collect(Collectors.toList());
            System.out.println("Lista de usuarios administradores del sistema");
            System.out.println(Arrays.toString(usuariosAdministrador.toArray()));
            System.out.println("Cantidad de usuarios admin: "+ usuariosAdministrador.size());

            List<String> rutList1= new ArrayList<>();
            for(int i=0;i<cantidadUsuariosTotales;i++)
            {
                String rut=usuarios.get(i).getRut();
                rutList1.add(rut);

            }

            System.out.println("Lista de rut de usuarios del sistema");
            System.out.println(Arrays.toString(rutList1.toArray()));

        } catch (Exception ex) {
            log.error("Error generico",ex);
        } finally {
            log.info("Se cierra bloque de calculos");
        }



        log.info("# END REPORT USERS SYSTEM #");
    }
}
