package com.verticurl.jenkins.verticurljenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VerticurlJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerticurlJenkinsApplication.class, args);
		System.out.println("Welcome to Verticurl");
	}
}
