package com.lito.eurekadiscovery03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaDiscovery03Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaDiscovery03Application.class, args);
	}

}
