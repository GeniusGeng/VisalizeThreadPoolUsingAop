package com.example.aopDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.example.aopDemo")
public class VisualizeThreadPoolUsingAop {

	public static void main(String[] args) {

		SpringApplication.run(VisualizeThreadPoolUsingAop.class, args);

	}
}