package com.springtraining.restaurantserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RestaurantserviceregistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantserviceregistryApplication.class, args);
    }

}
