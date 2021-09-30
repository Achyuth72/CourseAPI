package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.demo.topic")
@SpringBootApplication
public class CourseApplication {
	public static void main(String[] args) {
	SpringApplication.run(CourseApplication.class, args);
	}
	
	

}
