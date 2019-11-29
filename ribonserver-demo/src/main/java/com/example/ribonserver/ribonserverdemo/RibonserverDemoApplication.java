package com.example.ribonserver.ribonserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RibonserverDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibonserverDemoApplication.class, args);
	}

}
