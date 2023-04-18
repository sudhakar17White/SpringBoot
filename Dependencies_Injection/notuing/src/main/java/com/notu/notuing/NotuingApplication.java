package com.notu.notuing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NotuingApplication {

	public static void main(String[] args) {
		
		try (
			ConfigurableApplicationContext context = SpringApplication.run(NotuingApplication.class, args)) {
			dependecy_injection in=context.getBean(dependecy_injection.class);
			in.print();

		}
	}

}
