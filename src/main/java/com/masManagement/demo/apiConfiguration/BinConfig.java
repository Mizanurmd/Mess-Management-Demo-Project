package com.masManagement.demo.apiConfiguration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BinConfig {
	
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
		
	}

}
