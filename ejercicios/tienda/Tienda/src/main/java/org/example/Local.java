package org.example;

import java.io.Serializable;
import java.util.List;

public class Local implements Serializable {
    private String nombreLocal;
    private String direccion;
    private List<Producto> productoList;

    public Local(String nombreLocal, String direccion) {
        this.nombreLocal = nombreLocal;
        this.direccion = direccion;
    }

    public Local() {
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }
}
