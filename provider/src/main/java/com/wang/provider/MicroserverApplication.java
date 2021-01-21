package com.wang.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserverApplication.class, args);
	}

}
