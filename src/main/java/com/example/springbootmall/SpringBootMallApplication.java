package com.example.springbootmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(basePackages = "com.example.springbootmall.model.dao")
@EnableSwagger2
@EnableCaching
public class SpringBootMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMallApplication.class, args);
    }

}
