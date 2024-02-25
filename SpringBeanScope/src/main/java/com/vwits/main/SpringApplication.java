package com.vwits.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vwits.beans.VehicleService;
import com.vwits.configuration.ProjectConfiguration;

public class SpringApplication {
	
	public static void main(String[] args) {
		ApplicationContext context= new  AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		VehicleService service=context.getBean(VehicleService.class);
//		System.out.println(service.getName());
		
		VehicleService service1=context.getBean(VehicleService.class);
		
		if(service==service1)
		{
			System.out.println("Signleton Bean Scope.");
		}
		else {
			System.out.println("Prototype Bean Scope.");
		}
		
		System.out.println(service.hashCode());
		System.out.println(service1.hashCode());
	}
}
