package com.shree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SubServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubServeApplication.class, args);
	}

}
