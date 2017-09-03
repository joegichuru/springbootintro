package com.example.joseph.springbootintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
@EnableAutoConfiguration
public class SpringbootintroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootintroApplication.class, args);
	}

}