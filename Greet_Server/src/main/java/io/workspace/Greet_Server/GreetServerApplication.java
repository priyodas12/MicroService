package io.workspace.Greet_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GreetServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetServerApplication.class, args);
	}

}
@Configuration
class Config2 {
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplateInstance() {
		return new RestTemplate();
	}

}

