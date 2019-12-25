package com.wlf.web;

import com.wlf.entity.Product;
import com.wlf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@EnableSwagger2
public class ProductController {
  
    @Autowired
    ProductService productService;
     
    @GetMapping("/products")
    public Object products() {
        List<Product> ps = productService.listProducts();
        return ps;
    }
}