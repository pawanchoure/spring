package com.pawan.choure.SpringBootBaner;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class SpringBootBanerApplication {

	public static void main(String[] args) {
		SpringApplication app= new SpringApplication(SpringBootBanerApplication.class);
		app.setBanner((environment, sourceClass, out) -> out.println("This is my Banner"));

		app.run(args);
	}

}
