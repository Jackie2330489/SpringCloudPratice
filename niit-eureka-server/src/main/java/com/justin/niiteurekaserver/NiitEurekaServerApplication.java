package com.justin.niiteurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NiitEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiitEurekaServerApplication.class, args);
	}
}
