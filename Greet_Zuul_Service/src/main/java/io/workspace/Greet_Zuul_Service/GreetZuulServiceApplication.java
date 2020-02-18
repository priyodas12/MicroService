package io.workspace.Greet_Zuul_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class GreetZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetZuulServiceApplication.class, args);
	}
}
