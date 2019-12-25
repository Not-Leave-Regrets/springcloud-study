package com.wlf.client;


import com.wlf.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {

	@GetMapping("/products")
	public List<Product> listProdcuts();
}
