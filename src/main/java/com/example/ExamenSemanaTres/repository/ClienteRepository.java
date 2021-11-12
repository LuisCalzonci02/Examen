package com.example.ExamenSemanaTres.repository;

import com.example.ExamenSemanaTres.entity.Cliente;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
@Getter @Setter
public class ClienteRepository {
    private ArrayList<Cliente> clienteList = new ArrayList<>();

    public Optional<Cliente> buscarCliente(String nombre){
        return clienteList.stream().filter(cliente -> cliente.getNombre().equalsIgnoreCase(nombre)).findFirst();
    }

}
