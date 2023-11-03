package com.imarticus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmpProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpProducerApplication.class, args);
	}

}
