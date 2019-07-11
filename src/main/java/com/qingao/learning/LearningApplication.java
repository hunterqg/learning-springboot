package com.qingao.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@PropertySource("classpath:mytest.properties")
public class LearningApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(LearningApplication.class);
		app.addListeners(new Eventlistener());
		app.run(args);
	}

}
