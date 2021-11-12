package com.example.ExamenSemanaTres.entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Prestamo {

    private String id;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private String status;

    public Prestamo(String id, String fechaPrestamo, String fechaDevolucion, String status) {
        this.id = id;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.status = status;
    }

}
