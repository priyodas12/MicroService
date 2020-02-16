package io.workspace.Greet_Client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class GreetClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetClientApplication.class, args);
	}
}
@Configuration
 class Config1 {
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplateInstance() {
		return new RestTemplate();
	}

}
