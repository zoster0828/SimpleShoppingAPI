package com.zoster.SimpleShoppingAPI;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SimpleShoppingApiApplication {

	public static void main(String[] args) {
		try {
			run(SimpleShoppingApiApplication.class, args);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
