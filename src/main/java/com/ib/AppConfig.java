package com.ib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class AppConfig {
	@Bean
	@Scope("singleton")
	public Book createBook() {
		return new Book(); 
	}
	

}
