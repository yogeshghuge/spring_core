package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	
	@Bean
	public void m1()
	{
		System.out.println("m1 method called");
	}
	public void m2()
	{
		System.out.println("m2 method called");
	}
	
	@Bean
	public void m3()
	{
		System.out.println("m3 method called");
	}

}
