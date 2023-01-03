package com.app.SpringJenkinsApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringJenkinsAppApplication {

	/*
	 * @GetMapping("/") public String Home() { return "Hello Jenkins"; }
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsAppApplication.class, args);
	}

}
