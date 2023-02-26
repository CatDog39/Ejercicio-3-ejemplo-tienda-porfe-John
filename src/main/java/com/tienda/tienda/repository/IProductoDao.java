package com.tienda.tienda.repository;

import com.tienda.tienda.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IProductoDao extends CrudRepository<Producto,Integer> {

    @Query(value = "select * from productos where precio <= ?", nativeQuery = true)
    public List<Producto> BuscarProductosMenoresAlPrecio(Double precio);

    public Optional<Producto> findByNombre (String nombre);
}
