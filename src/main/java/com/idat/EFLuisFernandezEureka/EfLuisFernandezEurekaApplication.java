package com.idat.EFLuisFernandezEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EfLuisFernandezEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfLuisFernandezEurekaApplication.class, args);
	}

}
