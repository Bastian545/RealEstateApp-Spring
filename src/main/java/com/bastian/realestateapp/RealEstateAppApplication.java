package com.bastian.realestateapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class RealEstateAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(RealEstateAppApplication.class, args);
    }

}
