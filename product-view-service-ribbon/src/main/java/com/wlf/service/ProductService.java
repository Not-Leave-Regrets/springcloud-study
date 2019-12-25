package com.wlf.service;

import com.wlf.client.ProductClientRibbon;
import com.wlf.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
     @Autowired
     ProductClientRibbon productClientRibbon;

    public List<Product> listProducts(){
        return productClientRibbon.listProdcuts();
    }
}