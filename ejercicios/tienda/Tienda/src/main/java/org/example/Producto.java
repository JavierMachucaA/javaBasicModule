package org.example;

import java.io.Serializable;

public class Producto implements Serializable {
    private String nombre;
    private Integer codigoProducto;
    private Double peso;
    private Integer precio;

    public Producto() {
    }

    public Producto(String nombre, Integer codigoProducto, Double peso, Integer precio) {
        this.nombre = nombre;
        this.codigoProducto = codigoProducto;
        this.peso = peso;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigoProducto() {
        return codigoProducto;
    }

    public Double getPeso() {
        return peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoProducto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", codigoProducto=" + codigoProducto +
                ", peso=" + peso +
                ", precio=" + precio +
                '}';
    }
}
