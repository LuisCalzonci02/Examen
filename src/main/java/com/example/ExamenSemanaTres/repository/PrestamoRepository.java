package com.example.ExamenSemanaTres.repository;

import com.example.ExamenSemanaTres.entity.Cliente;
import com.example.ExamenSemanaTres.entity.Prestamo;

import java.util.ArrayList;
import java.util.Optional;

public class PrestamoRepository {

    private ArrayList<Prestamo> prestamoList = new ArrayList<>();

    public Optional<Prestamo> prestamoRepository(String nombre){
        return prestamoList.stream().filter(prestamo -> prestamo.getFechaPrestamo().equalsIgnoreCase(nombre)).findFirst();
    }

}
