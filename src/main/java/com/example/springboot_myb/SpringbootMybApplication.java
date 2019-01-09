package com.example.springboot_myb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot_myb.mapper")
public class SpringbootMybApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybApplication.class, args);
    }

}

