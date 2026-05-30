package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired // variable injection
	Engine engine;
	
	public void race() {
		System.out.println("Car is start now");
	}
}
