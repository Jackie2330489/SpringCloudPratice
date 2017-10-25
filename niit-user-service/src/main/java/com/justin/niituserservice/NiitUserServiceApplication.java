package com.justin.niituserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.justin.niituserservice.dao")
public class NiitUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiitUserServiceApplication.class, args);
	}
}
