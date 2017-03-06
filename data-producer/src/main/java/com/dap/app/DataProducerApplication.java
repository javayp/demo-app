package com.dap.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.dap")
public class DataProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataProducerApplication.class, args);
	}
}
