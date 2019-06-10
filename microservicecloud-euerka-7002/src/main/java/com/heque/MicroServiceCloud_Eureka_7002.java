package com.heque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServiceCloud_Eureka_7002 {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceCloud_Eureka_7002.class, args);

	}

}
