package com.spring.cloud.eurekaclient10001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekaclient10001Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaclient10001Application.class, args);
    }
}
