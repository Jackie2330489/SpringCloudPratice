package com.justin.niitconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NiitConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiitConfigClientApplication.class, args);
	}
}
