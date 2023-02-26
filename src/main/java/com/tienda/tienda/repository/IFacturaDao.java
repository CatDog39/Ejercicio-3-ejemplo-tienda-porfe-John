package com.tienda.tienda.repository;


import com.tienda.tienda.entity.Factura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaDao extends CrudRepository<Factura,Integer> {
}
