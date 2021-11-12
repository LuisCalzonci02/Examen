package com.example.ExamenSemanaTres.controller;

import com.example.ExamenSemanaTres.entity.Cliente;
import com.example.ExamenSemanaTres.entity.Prestamo;
import com.example.ExamenSemanaTres.repository.PrestamoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("prestamo")
public class PrestamoController {

    @Autowired
    PrestamoRepository prestamoRepository;

    @Autowired
    private ModelMapper modelMapper;

    private List<Prestamo> prestamoList = new LinkedList<Prestamo>();

    @GetMapping
    public List<Prestamo> getPrestamo(){
        return prestamoList;
    }
    @PostMapping
    public void createPrestamo(Prestamo prestamo){
        prestamoList.add(prestamo);
    }
    @PutMapping
    public void modificarPrestamo(Prestamo prestamo){
        eliminarPrestamo(prestamo.getFechaPrestamo());
        prestamoList.add(prestamo);
    }
    @DeleteMapping
    public void eliminarPrestamo(Prestamo prestamo){
        Optional <Prestamo> optionalPrestamo = prestamoRepository.buscarPrestamo(prestamo);
        optionalPrestamo.ifPresent(value -> prestamoRepository.getPrestamoList().remove(value));
    }

}
