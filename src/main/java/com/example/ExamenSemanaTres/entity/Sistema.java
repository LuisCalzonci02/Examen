package com.example.ExamenSemanaTres.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Sistema {

    private List<Prestamo> prestamoList;
    private  List<Cliente> clienteList;
    private List<PrestamoItem> prestamoItemList;


}
