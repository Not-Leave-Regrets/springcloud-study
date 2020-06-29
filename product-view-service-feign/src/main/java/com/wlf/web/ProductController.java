package com.wlf.web;


import com.netflix.discovery.converters.Auto;
import com.wlf.client.ProductClientFeign;
import com.wlf.entity.Product;
import com.wlf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RefreshScope
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductClientFeign productClientFeign;
	@Value("${version}")
	String version;
	
    @RequestMapping("/products")
    public Object products(Model m) {
    	List<Product> ps = productService.listProduct();
    	m.addAttribute("version", version);    	
    	m.addAttribute("ps", ps);
        return "products";
    }
    @GetMapping("/thisIsTest/{str}")
	public String test(@PathVariable  String str){
		String s = productClientFeign.testFeign(str);
		return "this is "+s;
	}

}