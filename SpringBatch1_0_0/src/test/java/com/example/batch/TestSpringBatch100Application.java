package com.example.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringBatch100Application {

	public static void main(String[] args) {
		SpringApplication.from(SpringBatch100Application::main).with(TestSpringBatch100Application.class).run(args);
	}

}
