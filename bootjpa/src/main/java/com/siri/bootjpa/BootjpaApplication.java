package com.siri.bootjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.siri.controller","com.siri.dao"})
@SpringBootApplication
public class BootjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootjpaApplication.class, args);
	}

}
