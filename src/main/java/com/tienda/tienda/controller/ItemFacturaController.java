package com.tienda.tienda.controller;


import com.tienda.tienda.entity.ItemFactura;
import com.tienda.tienda.service.ItemFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/item")
public class ItemFacturaController {

    @Autowired
    ItemFacturaService itemFacturaService;

    @PostMapping(value = "/guardar")
    public ItemFactura guardarItem(@RequestBody ItemFactura item){
        return itemFacturaService.guardarItemFactura(item);
    }

    @GetMapping(value = "/obtener-item")
    public ItemFactura obtenerFactura(Integer id){
        return itemFacturaService.obtenerItem(id);
        }
    }

