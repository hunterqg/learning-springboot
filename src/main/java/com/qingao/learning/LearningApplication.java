package com.qingao.learning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

@SpringBootApplication
@EnableScheduling
@PropertySource("classpath:mytest.properties")
@MapperScan("com.qingao.learning.mapper")
public class LearningApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(LearningApplication.class);
		app.addListeners(new Eventlistener());
		app.run(args);
	}

}
