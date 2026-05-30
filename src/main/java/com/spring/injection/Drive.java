package com.spring.injection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.AppConfig;

public class Drive {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		Theater t = app.getBean(Theater.class);
		t.show();
		app.close();
	}
}
