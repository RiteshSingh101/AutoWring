package com.spring.injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Dhurandar implements Movie {
	@Override
	public void play() {
		System.out.println("Andhi ban kr aya hu...");
	}
}
