package com.example.hello_wu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWuApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWuApplication.class, args);
    System.out.println("Runs at localhost:8080");
	}

}
