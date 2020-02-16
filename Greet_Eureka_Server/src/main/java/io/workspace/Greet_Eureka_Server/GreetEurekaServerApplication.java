package io.workspace.Greet_Eureka_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GreetEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetEurekaServerApplication.class, args);
	}

}
