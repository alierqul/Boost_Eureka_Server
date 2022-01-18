package com.aliergul.coursapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CoursAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursAppApplication.class, args);
    }

}
