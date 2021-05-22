package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.beans.Car;

@SpringBootApplication
public class SpringbootApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringbootApp1Application.class, args);
		Car c=new Car();
		c.generateEngine();
		
		context.close();
	}

}
