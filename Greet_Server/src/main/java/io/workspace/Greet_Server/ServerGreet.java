package io.workspace.Greet_Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/server")
public class ServerGreet {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/greet/{user}")
	public String greetUser(@PathVariable String user) {
		return "Welcome "+user;
	}
	
	@GetMapping("/device-info")
	public String getInfo() {
		String url="http://greet-client/client/info";
		return restTemplate.getForObject(url, String.class);
	}
}
