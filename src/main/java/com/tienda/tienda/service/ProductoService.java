package com.tienda.tienda.service;

import com.tienda.tienda.entity.Producto;
import com.tienda.tienda.repository.IProductoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    IProductoDao productoDao;

    public Producto saveProducto(Producto producto){
        return productoDao.save(producto);
    }

    public boolean saveProductos(List<Producto> productos){
        try {
            productoDao.saveAll(productos);
            return  true;
        }catch (Exception e){
            return  false;
        }
    }

    public List<Producto> obtenerProductoMenoresPrecio(Double precio){
        return  productoDao.BuscarProductosMenoresAlPrecio(precio);
    }

    public Producto encntrarProductoNombre(String nombre){
        return productoDao.findByNombre(nombre).orElse(null);
    }
}
