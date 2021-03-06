package com.lito.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Producer01Application {

	public static void main(String[] args) {
		SpringApplication.run(Producer01Application.class, args);
	}

}
