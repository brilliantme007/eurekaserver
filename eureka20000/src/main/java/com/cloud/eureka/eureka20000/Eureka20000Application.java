package com.cloud.eureka.eureka20000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
@EnableEurekaServer
public class Eureka20000Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka20000Application.class, args);
    }
}
