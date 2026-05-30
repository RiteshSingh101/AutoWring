package com.spring.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Theater {
	
	@Value(value = "Imax")
	String name;
	
	@Value(value = "Sector 2 neral")
	String address;
	
	//@Autowired
	Movie movie;
	
	
	//@Autowired
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	@Autowired
	public void Theather(@Qualifier(value = "dhurandar") Movie movie) {
		this.movie = movie;
	}
	
	public void show() {
		System.out.println("---Movie---");
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		
		System.out.println("------Play---------");
		System.out.println("Movie: "+movie);
		movie.play();
	}
	
}
