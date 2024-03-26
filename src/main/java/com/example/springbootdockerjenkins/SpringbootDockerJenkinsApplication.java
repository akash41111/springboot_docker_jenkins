package com.example.springbootdockerjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerJenkinsApplication {
	@GetMapping("/hello")
	public String hello() {
		return "Docker jenkins pipeline";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerJenkinsApplication.class, args);
	}

}
