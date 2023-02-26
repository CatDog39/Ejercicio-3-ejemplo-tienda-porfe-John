package com.tienda.tienda.service;

import com.tienda.tienda.entity.Factura;
import com.tienda.tienda.repository.IFacturaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService {

    @Autowired
    IFacturaDao facturaDao;

    public Factura nuevaFactura(Factura nuevaFactura){
        return facturaDao.save(nuevaFactura);
    }

    public Factura obtenerFactura(Integer id){
         return facturaDao.findById(id).orElse(null);
    }


}
