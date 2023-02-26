package com.tienda.tienda.controller;

import com.tienda.tienda.entity.Producto;
import com.tienda.tienda.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @PostMapping(value = "/guardar")
    public Producto guardarProducto(@RequestBody Producto producto){
        return productoService.saveProducto(producto);
    }

    @PostMapping(value = "/guardar-todo")
    public boolean guardarProductos(@RequestBody List<Producto> producto){
        return productoService.saveProductos(producto);
    }

    @GetMapping(value = "/obtener-productos-menores")
    public List<Producto>productosMenoresPrecio(Double precio){
        return productoService.obtenerProductoMenoresPrecio(precio);
    }

    @GetMapping(value = "/obtener-nombre")
    public Producto encontraPorNombre(String nombre){
        return productoService.encntrarProductoNombre(nombre);
    }

}
