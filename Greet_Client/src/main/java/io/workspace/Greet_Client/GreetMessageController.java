package io.workspace.Greet_Client;

import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class GreetMessageController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/greetme/{user}")
	public String greetMe(@PathVariable String user) {
		String url="http://greet-server/server/greet/"+user;
		return restTemplate.getForObject(url, String.class);
	}
	
	
	@GetMapping("/info")
	public String getDeviceInfo() {
		//logic
		return "Mobile";
		//String url="http://greet-server/server/greet/"+user;
		//return restTemplate.getForObject(url, String.class);
	}
	
	

}
