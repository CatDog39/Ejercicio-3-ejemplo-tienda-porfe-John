package com.tienda.tienda.repository;

import com.tienda.tienda.entity.ItemFactura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IItemFacturaDao extends CrudRepository<ItemFactura,Integer> {
}
