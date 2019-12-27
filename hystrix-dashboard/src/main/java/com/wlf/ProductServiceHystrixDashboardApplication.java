package com.wlf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
/**
 * 没有加注解；
 * @EnableEurekaClient
 * 但在application.yml 中配置了注册中心，也可以注册到eureka中去，因为spring-cloud-starter-netflix-eureka-client会自动去注册
 */
@SpringBootApplication
@EnableHystrixDashboard

public class ProductServiceHystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceHystrixDashboardApplication.class,args);
    }
 
}