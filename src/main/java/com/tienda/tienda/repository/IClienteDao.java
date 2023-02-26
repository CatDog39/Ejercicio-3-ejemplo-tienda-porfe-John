package com.tienda.tienda.repository;

import com.tienda.tienda.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDao extends CrudRepository<Cliente,Integer> {
}
