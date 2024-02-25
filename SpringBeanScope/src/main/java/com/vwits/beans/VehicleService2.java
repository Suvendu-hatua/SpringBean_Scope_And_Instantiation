package com.vwits.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//By default Spring will make al the bean scope as singleton.
//@Scope(BeanDefinition.SCOPE_SINGLETON)
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)

//By default all the instantiation of beans will be Egar Instantiation.

@Lazy
public class VehicleService2 {
	
	private String name="Volkswagen";
	
	private String color;
	
	public VehicleService2() {
		System.out.println("Bean is created by Spring context.");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
