package com.enrollee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
public class EnrolleeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnrolleeServiceApplication.class, args);
	}

}
