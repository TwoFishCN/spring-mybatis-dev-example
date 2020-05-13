package com.example.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.example.mybatis.mapper")
@SpringBootApplication
public class SpringMybatisDevExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisDevExampleApplication.class, args);
    }
}
