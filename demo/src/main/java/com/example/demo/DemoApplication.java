package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		Alien a = context.getBean(Alien.class);
		a.setaid(10);
		a.laptop.setram(4);
        System.out.println(a.getaid());
		a.show();

		Alien a1 = context.getBean(Alien.class);
		System.out.println(a1.getaid());
		a1.show();
	}

}
