package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class WebsocketApplication implements ApplicationContextAware{

	public static void main(String[] args) {
		SpringApplication.run(WebsocketApplication.class, args);
		System.out.println("****************************************************************");
		System.out.println("****************************************************************");
		System.out.println("****************************************************************");
		System.out.println("****************************************************************");
		System.out.println("****************************************************************");
		System.out.println("****************************************************************");
		System.out.println("****************************************************************");
		System.out.println("****************************************************************");
		System.out.println("****************************************************************");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		String[] strings = applicationContext.getBeanNamesForAnnotation(Study.class);
		for (String string : strings) {
			System.out.println(string);
		}
	}
}
