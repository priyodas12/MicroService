package io.workspace.Greet_Client;

import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/client")
public class GreetMessageController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	//to test fallback utility functionality ,lets shut down Greet Server
	@HystrixCommand(defaultFallback = "nothingFound",threadPoolKey = "greetThread")
	@GetMapping("/greetme/{user}")
	public String greetMe(@PathVariable String user) {
		String url="http://greet-server/server/greet/"+user;
		return restTemplate.getForObject(url, String.class);
	}
	
	
	@GetMapping("/info")
	public String getDeviceInfo() {
		//logic
		return "{Mobile:Android}";	
	}
	
	public String nothingFound(Throwable greetThread) {
		return " Wait! Am not finding Anything Now!";
	}

}
