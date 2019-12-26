package com.wlf.hystrix;

import com.wlf.client.ProductClientFeign;
import com.wlf.entity.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductClientFeignHystrix implements ProductClientFeign {
    @Override
    public List<Product> listProducts() {
        List<Product> result = new ArrayList<>();
        result.add(new Product(0,"产品数据微服务不可用",0));
        return result;
    }
}
