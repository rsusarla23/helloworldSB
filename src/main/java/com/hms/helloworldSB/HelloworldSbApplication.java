package com.hms.helloworldSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldSbApplication {

	public static void main(String[] args) {
		System.out.println("Making a change in the file for the sake of changing ");
		SpringApplication.run(HelloworldSbApplication.class, args);
	}

}
