package com.spring.cloud.eurekaclient10002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekaclient10002Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaclient10002Application.class, args);
    }
}
