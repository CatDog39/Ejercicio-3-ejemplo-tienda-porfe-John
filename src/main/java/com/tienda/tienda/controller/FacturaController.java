package com.tienda.tienda.controller;

import com.tienda.tienda.entity.Factura;
import com.tienda.tienda.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/facturas")
public class FacturaController {

    @Autowired
    FacturaService facturaService;

    @PostMapping(value = "/crear")
    public Factura crearFactura(@RequestBody Factura factura){
        return facturaService.nuevaFactura(factura);
    }

    @GetMapping(value = "/obtener")
    public Factura obtenerFactura(Integer id){
        return  facturaService.obtenerFactura(id);
    }
}
