package com.excelr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JulyFirstSpringbootApp1Application {

	public static void main(String[] args) {
		
		//IOC STARTS
	ApplicationContext	con=SpringApplication.run(JulyFirstSpringbootApp1Application.class, args);
	
	  //getBean() for Car
	Car c1= con.getBean(Car.class);



		System.out.println("Durgaprasad babu from central");

	
	System.out.println("hemanth babu from local");

	}

}
