package com.tienda.tienda.controller;

import com.tienda.tienda.entity.Cliente;
import com.tienda.tienda.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping(value = "/crear")
    public Cliente agregarCliente(@RequestBody Cliente cliente){
        return clienteService.crearCliente(cliente);
    }
}
