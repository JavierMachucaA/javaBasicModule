package org.example;

import java.io.Serializable;
import java.util.List;

public class Tienda implements Serializable {
    private String nombreFantasia;
    private String rut;
    private Integer numero;
    private String slogan;
    private List<Local> localList;

    public Tienda() {
    }

    public Tienda(String nombreFantasia, String rut, Integer numero, String slogan, List<Local> localList) {
        this.nombreFantasia = nombreFantasia;
        this.rut = rut;
        this.numero = numero;
        this.slogan = slogan;
        this.localList = localList;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public List<Local> getLocalList() {
        return localList;
    }

    public void setLocalList(List<Local> localList) {
        this.localList = localList;
    }
}
