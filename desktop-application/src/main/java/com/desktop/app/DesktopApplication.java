package com.desktop.app;

import com.configuration.DesktopLoadBalancer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableZuulProxy
@EnableCircuitBreaker
@EnableFeignClients(basePackages = {"com.desktop.feign"})
@RibbonClient(name = "DATA-PRODUCER-SERVICE",configuration = DesktopLoadBalancer.class)
@ComponentScan("com.desktop")
public class DesktopApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesktopApplication.class, args);
	}
}
