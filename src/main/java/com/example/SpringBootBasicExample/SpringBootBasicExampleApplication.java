package com.example.SpringBootBasicExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicExampleApplication.class, args);
		
		int result = addNumbers(15, 25);
		System.out.println("Sum = " + result);

	}

	public static int addNumbers(int a, int b) {
		return a + b;
	}
}
