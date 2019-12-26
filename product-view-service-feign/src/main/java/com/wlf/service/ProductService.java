package com.wlf.service;

import com.wlf.client.ProductClientFeign;
import com.wlf.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductClientFeign productClientFeign;

    public List<Product> listProduct(){
        return productClientFeign.listProducts();
    }
}
