package com.wuhj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceHi8082Application {

	@Value("${server.port}")
	private String port;
	public static void main(String[] args) {
		SpringApplication.run(ServiceHi8082Application.class, args);
	}

	@GetMapping("/hi")
	public String sayHi(String name) {
		return "hi " + name + ",i am from port:" + port;
	}
}
