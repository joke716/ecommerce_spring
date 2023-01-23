package com.teddy.ecommerce_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class EcommerceSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceSpringApplication.class, args);
    }

}
