package com.lito.eurekadiscovery02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaDiscovery02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaDiscovery02Application.class, args);
	}

}
