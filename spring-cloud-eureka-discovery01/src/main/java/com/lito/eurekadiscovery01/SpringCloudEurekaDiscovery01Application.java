package com.lito.eurekadiscovery01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringCloudEurekaDiscovery01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaDiscovery01Application.class, args);
	}

}
