package com.example.ExamenSemanaTres.controller;

import com.example.ExamenSemanaTres.dto.ClienteDTO;
import com.example.ExamenSemanaTres.entity.Cliente;
import com.example.ExamenSemanaTres.entity.Prestamo;
import com.example.ExamenSemanaTres.repository.ClienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    private ModelMapper modelMapper;

    private List<Cliente> clienteList = new LinkedList<Cliente>();

    @GetMapping
    public List<Cliente> getCliente(){
        return clienteList;
    }

     @GetMapping("/nombre")
     public ResponseEntity<Cliente> getCliente(@PathVariable String nombre ) throws ClienteInexistenteEception{
        Optional<Cliente> optionalCliente = clienteRepository.buscarCliente(nombre);
        if (optionalCliente.isEmpty()){
            throw new ClienteInexistenteEception();
        }
        return ResponseEntity.ok(optionalCliente.get());
     }

    @PostMapping
    //public void createCliente(ClienteDTO clienteDTO){
        public void createCliente(Cliente cliente){
               clienteList.add(cliente);
//        Cliente cliente = modelMapper.map(clienteDTO, Cliente.class);
//        clienteRepository.getClienteList().add(cliente);
    }
    @PutMapping
    public void modificarCliente(Cliente cliente){
        eliminarCliente(cliente.getNombre());
        clienteList.add(cliente);
    }
    @DeleteMapping
    public void eliminarCliente(String cliente){
        Optional <Cliente> optionalCliente = clienteRepository.buscarCliente(cliente);
        optionalCliente.ifPresent(value-> clienteRepository.getClienteList().remove(value));
    }






}
