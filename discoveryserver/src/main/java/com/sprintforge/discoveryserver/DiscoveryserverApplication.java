package com.sprintforge.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryserverApplication {

    static void main(String[] args) {
        SpringApplication.run(DiscoveryserverApplication.class, args);
    }

}
