package com.tienda.tienda.service;

import com.tienda.tienda.entity.Cliente;
import com.tienda.tienda.repository.IClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    IClienteDao clienteDao;

    public Cliente crearCliente (Cliente nuevoCliente){
        return clienteDao.save(nuevoCliente);
    }
}
