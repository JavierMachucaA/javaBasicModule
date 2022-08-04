package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productoList = new ArrayList<>();

        productoList.add(new Producto("Leche",123091,1d,990));
        productoList.add(new Producto("Nectar",123092,1d,1990));
        productoList.add(new Producto("Vino",123093,0.7,6000));
        productoList.add(new Producto("Palta",123094,1d,10000000));
        productoList.add(new Producto("Manjar",123095,1d,2090));

        System.out.println("productoList:"+productoList);
    }
}