package org.springframework.cloud.stream.app.integration.test.processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegrationTestProcessorRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationTestProcessorRabbitApplication.class, args);
	}
}
