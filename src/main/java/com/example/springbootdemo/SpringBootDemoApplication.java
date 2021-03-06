package com.example.springbootdemo;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemoApplication {

	@Bean
	public ExitCodeGenerator exitCodeGenerator(){
		return () -> 42;
	}

	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(SpringBootDemoApplication.class);
//		app.setBannerMode(Banner.Mode.OFF);
//		app.setAddCommandLineProperties(Boolean.FALSE);
//		app.run(args);
//		System.exit(SpringApplication.exit(SpringApplication.run(SpringBootDemoApplication.class, args)));
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
