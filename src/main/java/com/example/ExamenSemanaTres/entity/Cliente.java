package com.example.ExamenSemanaTres.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Cliente {

    private String id;
    private String nombre;
    private String direccion;


    public Cliente(String id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;

    }
}
