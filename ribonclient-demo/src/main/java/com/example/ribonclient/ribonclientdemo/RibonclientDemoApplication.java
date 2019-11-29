package com.example.ribonclient.ribonclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name = "ribon-server", configuration = RibbonConfiguration.class)
public class RibonclientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibonclientDemoApplication.class, args);
	}

}
