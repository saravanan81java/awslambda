package com.awslam.awslambda;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AwslambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwslambdaApplication.class, args);
	}
	
	@Bean
    public Function<String, String> helloWorld() {
        return input -> "Hello, " + input + " from AWS Lambda!";
    }

}
