package com.spring.injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Bhahubali implements Movie{
	public void play() {
		System.out.println("Katapa Takla he...");
	}
}
