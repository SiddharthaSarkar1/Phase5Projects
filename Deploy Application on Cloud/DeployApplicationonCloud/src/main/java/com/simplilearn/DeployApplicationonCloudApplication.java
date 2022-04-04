package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.simplilearn.controller")
@SpringBootApplication
public class DeployApplicationonCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployApplicationonCloudApplication.class, args);
	}

}
