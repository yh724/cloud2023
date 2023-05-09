package com.jk.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrerMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrerMain80.class,args);
    }
}
