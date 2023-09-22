package com.example.notu;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NotuApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(NotuApplication.class, args);
		services sr = con.getBean(services.class);
		sr.Banner();
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		sr.Getmark(size);
		sr.Disp();
		sr.psfa(size);

	}

}
