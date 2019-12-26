package com.wlf.client;

import com.wlf.entity.Product;
import com.wlf.hystrix.ProductClientFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 熔断器功能：
 * fallback:如果访问的PRODUCT-DATA-SERVICE服务不可用的话，就访问ProductClientFeignHystrix来进行反馈信息
 */
@FeignClient(value="PRODUCT-DATA-SERVICE",fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {
    @GetMapping("/products")
    public List<Product> listProducts();
}
