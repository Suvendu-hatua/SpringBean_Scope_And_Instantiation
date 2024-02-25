package com.vwits.main;

import java.lang.invoke.VarHandle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vwits.beans.VehicleService2;
import com.vwits.configuration.ProjectConfiguration;

public class SpringApplication1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var context=new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		System.out.println("Before Creating Bean....");
		VehicleService2 service=context.getBean(VehicleService2.class);
		
		System.out.println("After creating bean....");
		System.out.println();
	}

}
