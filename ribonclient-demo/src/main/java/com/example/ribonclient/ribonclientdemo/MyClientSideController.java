package com.example.ribonclient.ribonclientdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyClientSideController {
	/*
	 * In the frontend microservice, we are calling the backend microservice using
	 * RestTemplate. Rest tempate is enabled as client side load balancer
	 * using @LoadBalanced annotation.
	 */
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/client/frontend")
	public String hi() {
		String randomString = this.restTemplate.getForObject("http://ribon-server/backend", String.class);
		return "Server Response :: " + randomString;
	}
}
