package com.wuhj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ServiceHiApplication {

	/*@Value("${server.port}")
	private String port;*/

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}

	@GetMapping("/hi")
	public String sayHi(String name) {
		return "hi " + name + ",i am from port:";
	}
}
