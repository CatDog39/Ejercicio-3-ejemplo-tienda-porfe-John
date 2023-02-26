package com.tienda.tienda.service;

import com.tienda.tienda.entity.ItemFactura;
import com.tienda.tienda.repository.IItemFacturaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemFacturaService {

    @Autowired
    IItemFacturaDao itemFacturaDao;

    public ItemFactura guardarItemFactura(ItemFactura itemFactura){
        return  itemFacturaDao.save(itemFactura);
    }

    public ItemFactura obtenerItem(Integer id){
        return itemFacturaDao.findById(id).orElse(null);
    }
}
